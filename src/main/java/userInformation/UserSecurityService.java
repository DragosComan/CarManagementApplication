package userInformation;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserSecurityService extends UserInformation {
    @Autowired
    private UserRepository userRepository;

    public UserSecurityService(String id, String surName, String firstName) {
        super(id, surName, firstName);
    }

    public static void saveUser(String id, String surName) {
    }

    @Override
    public UserDetails loadUserByUsername(String surname) throws UsernameNotFoundException {
        User user = userRepository.findByName(surname);
        if(user == null) {
            throw new UsernameNotFoundException(surname);
        }

        return null;
    }
}
