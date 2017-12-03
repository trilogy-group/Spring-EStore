package pk.habsoft.demo.estore.model;

import java.io.Serializable;

public class LoginRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    private String user;
    private String password;

    public LoginRequest() {
        // Default constructor
    }

    public LoginRequest(String user, String password) {
        super();
        this.user = user;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "LoginRequest [user=" + user + ", password=" + password + "]";
    }

}
