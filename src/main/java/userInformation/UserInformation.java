package userInformation;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public abstract class UserInformation {
    private String id;
    private String surName;
    private String firstName;

    public UserInformation(String id, String surName, String firstName) {
        this.id = id;
        this.surName = surName;
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserDetails loadUserById(String id) throws UsernameNotFoundException {
        return null;
    }

    public abstract UserDetails loadUserByUsername(String surname) throws UsernameNotFoundException;
}
