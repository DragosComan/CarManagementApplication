package controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import userInformation.UserRepository;

@RestController
@RequestMapping
public class UserRestController {
    final UserRepository userRepository;

    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/count")
    public String count() {

        Logger LOGGER = LogManager.getLogger(this.getClass());
        LOGGER.debug(" usersCount");
        Long usersCount = this.userRepository.count();

        return "{ \"usersCount\": " + usersCount + "}";
    }
}
