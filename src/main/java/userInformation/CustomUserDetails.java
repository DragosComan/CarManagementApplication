package userInformation;

import org.apache.catalina.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import java.util.List;


public interface CustomUserDetails extends UserRepository{
    String surname = null;
    String id = null;

    @Override
    User findByName(String id);

    @Override
    List<UserInformation> findAll();

    @Override
    void deleteById(String id);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
