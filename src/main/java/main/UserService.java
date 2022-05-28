package main;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import userInformation.UserRepository;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User saveUser(String username, String password) {
        User existingUser = (User) userRepository.findById();
        if (existingUser != null) {
            throw new RuntimeException("duplicate username");
        }

        return existingUser;
    }
}

