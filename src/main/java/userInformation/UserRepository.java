package userInformation;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserRepository extends UserDetailsService {
    User findByName(String id);

    List<UserInformation> findAll();

    void deleteById(String id);
}
