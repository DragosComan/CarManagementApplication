package userInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserSecurityService extends UserInformation{
    @Autowired
    private UserRepository userRepository;

    public UserSecurityService(String id, String surName, String firstName) {
        super(id, surName, firstName);
    }

    public static void saveUser(String id, String surName) {
    }

    @Override
    public UserDetails loadUserByUsername(String surname) throws UsernameNotFoundException {
        Optional<UserInformation> user = userRepository.findById(getId());
        if(user == null) {
            throw new UsernameNotFoundException(surname);
        }

        return null;
    }
}
