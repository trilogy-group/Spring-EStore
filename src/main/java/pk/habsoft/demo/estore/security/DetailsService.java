package pk.habsoft.demo.estore.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import pk.habsoft.demo.estore.model.UserDTO;
import pk.habsoft.demo.estore.repository.UserRepository;

@Component
public class DetailsService implements UserDetailsService {

    @Autowired
    UserRepository users;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("DetailsService::loadUserByUsername() : " + username);
        Optional<UserDTO> userOptional = users.findByUsername(username);
        if (!userOptional.isPresent()) {
            throw new UsernameNotFoundException(username + " was not found");
        }
        return userOptional.get();
    }
}