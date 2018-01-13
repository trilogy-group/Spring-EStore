EStore app
====
A CRUD application to learn and implement spring concepts.

1. Spring Boot
2. IoC aka DI injection
3. Rest API documentation using Swagger
4. Spring Security  
	* Basic authentication  
	* Role base API authorization   


# Swagger configuration

- Swagger UI can be seen using this URL : [/estore/swagger-ui.html](http://localhost:8181/estore/swagger-ui.html)

# Spring Security

## Basic Authentication
API's can be accessed by providing Base64 encoded credentials with each request, using HTTP [Authorization] header.
Also need to exclude Swagger-UI resources from security configuration in order to be accessible without credentials.

## Protecting APIs against user roles
API's can be protected against user roles in WebSecurityConfiguration.java file.

> `http.antMatchers("/users/*").hasRole("USER")`

## Methods level security
Method level security can be enabled using
> `@EnableGlobalMethodSecurity(prePostEnabled = true)`  

Then you can use @PreAuthorize annotaion on methods.  
> `@PreAuthorize("hasRole('ADMIN')")` or `@PreAuthorize("hasAuthority('ROLE_ADMIN')")`


# Other Spring Concepts
1. Validating spring properties on bootstrap and fail fast if any important property is missing.    
`BeanFactoryPostProcessor is used in VerifierBean for this purpose.`
2. StartupLoggingBean implemented to log some environment info at application startup


# Code Quality Analysis

## SonarQube integration
#### Prerequisites
1. SonarQube already installed and running (url=my.sonar.host:9000) 
#### Run following command to analyze project and post results on server
> `mvn clean install -Psonar sonar:sonar`
