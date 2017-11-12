package pk.habsoft.demo.estore.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import pk.habsoft.demo.estore.model.UserDTO;

@Component
public class UserRepository {

    private static final List<UserDTO> USERS = new ArrayList<>();
    static {
        USERS.add(new UserDTO("Criss", "Jordan", "user", "user", new String[] { "ROLE_USER" }));
        USERS.add(new UserDTO("Micheal", "Clarke", "admin", "admin", new String[] { "ROLE_ADMIN" }));
    }

    public Optional<UserDTO> findByUsername(String username) {
        return USERS.stream().filter(e -> e.getUsername().equals(username)).findFirst();
    }
}
