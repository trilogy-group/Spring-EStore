package pk.habsoft.demo.estore.endpoint;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Api.MethodAuthorization.BASE_URL)
public class MethodAuthorizationEndPoint {

    private static final String HAS_ROLE_USER = "hasRole('USER')";
    private static final String HAS_AUTHORITY_ADMIN = "hasAuthority('ROLE_ADMIN')";
    // "hasRole('ADMIN') AND hasRole('DBA')"

    @RequestMapping(value = Api.MethodAuthorization.USER_PAGE, method = RequestMethod.GET)
    @PreAuthorize(HAS_ROLE_USER)
    public String testUserRole() {
        return "Only users can access this page.";
    }

    @RequestMapping(value = Api.MethodAuthorization.ADMIN_PAGE, method = RequestMethod.GET)
    @PreAuthorize(HAS_AUTHORITY_ADMIN)
    public String testAdminRole() {
        return "Only admins can access this page";
    }

    @RequestMapping(value = Api.MethodAuthorization.COMMON_PAGE, method = RequestMethod.GET)
    public String testCommonRole() {
        return "Anyone can access this page";
    }
}
