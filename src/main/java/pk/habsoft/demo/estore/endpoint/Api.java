package pk.habsoft.demo.estore.endpoint;

public interface Api {

    public interface UrlAuthorization {
        String BASE_URL = "/urlsecurity";
        String USER_PAGE = "/userpage";
        String ADMIN_PAGE = "/adminpage";
        String COMMON_PAGE = "/commonpage";
    }

    public interface MethodAuthorization {
        String BASE_URL = "/methodsecurity";
        String USER_PAGE = "/userpage";
        String ADMIN_PAGE = "/adminpage";
        String COMMON_PAGE = "/commonpage";
    }
}
