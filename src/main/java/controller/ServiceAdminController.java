package controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import userInformation.CustomUserDetails;
import userInformation.UserInformation;
import userInformation.UserRepository;
import userInformation.UserSecurityService;

import java.security.Principal;
import java.util.List;
import java.util.UUID;

public class ServiceAdminController {
    private static final Logger LOGGER = LogManager.getLogger(ServiceAdminController.class);

    private final UserRepository userRepository;
    private final UserSecurityService userSecurityService;

    public ServiceAdminController(UserRepository userRepository, UserSecurityService userSecurityService) {
        this.userRepository = userRepository;
        this.userSecurityService = userSecurityService;
    }

    @GetMapping("/users")
    public String list(Model model, Principal principal) {
        LOGGER.debug("S-a apelat list");
        LOGGER.debug("principal:" + principal.getName());
        List<UserInformation> users = this.userRepository.findAll();
        model.addAttribute("users", users);
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        authentication.getPrincipal();

        LOGGER.info("Logged in user id:"+getUserInformation(principal).getId());

        return "users/list";
    }

    private CustomUserDetails getUserInformation(Principal principal) {
        return null;
    }

    @GetMapping("/registration")
    public String form(){
        return "users/add";
    }

    @PostMapping("/registration")
    public String addUser(Model model,
                          @RequestParam("ID") String id,
                          @RequestParam("Surname") String surName){
        UserSecurityService.saveUser(id, surName);
        return "redirect:/";
    }

    @PostMapping("/users/delete/{id}")
    public String deleteById(@PathVariable("id") String id){
        userRepository.deleteById(id);
        return "redirect:/users/";
    }

    private CustomUserDetails getUserDetailsFromAuthentication(Principal principal) {
        return ((CustomUserDetails)((UsernamePasswordAuthenticationToken) principal).getPrincipal());
    }
}
