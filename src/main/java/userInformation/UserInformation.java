package userInformation;

import java.util.UUID;

public class UserInformation {
    private UUID id;
    private String surName;
    private String firstName;

    public UserInformation(UUID id, String surName, String firstName) {
        this.id = id;
        this.surName = surName;
        this.firstName = firstName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
}
