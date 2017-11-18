package pk.habsoft.demo.estore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.stereotype.Component;

import pk.habsoft.demo.estore.endpoint.Endpoints;
import pk.habsoft.demo.estore.model.UserDTO;
import pk.habsoft.demo.estore.security.AppUserDetailsService;

@Component
@EnableWebSecurity()
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    AppUserDetailsService detailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(detailsService).passwordEncoder(UserDTO.PASSWORD_ENCODER);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        System.out.println("Configure security");
        http
        //.csrf().disable()
        .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
        .authorizeRequests() 
            .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()//allow CORS option calls
            .antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources", "/configuration/security",
                        "/swagger-ui.html", "/webjars/**", "/swagger-resources/configuration/ui").permitAll()
            .antMatchers(Endpoints.UrlAuthorization.BASE_URL + Endpoints.UrlAuthorization.USER_PAGE).hasRole("USER") // Shouln't user (ROLE_USER)
            .antMatchers(Endpoints.UrlAuthorization.BASE_URL + Endpoints.UrlAuthorization.ADMIN_PAGE).hasRole("ADMIN")
            .anyRequest().authenticated()
                .and()
                .httpBasic();
        // @formatter:on
    }
}