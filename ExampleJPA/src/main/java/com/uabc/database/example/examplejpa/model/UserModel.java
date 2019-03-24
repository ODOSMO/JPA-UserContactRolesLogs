package com.uabc.database.example.examplejpa.model;

import com.uabc.database.example.examplejpa.entity.UserRole;
import lombok.Data;

import java.util.Set;

@Data
public class UserModel {
    private String username;
    private String password;
    private Boolean enabled;
    private Set<UserRole> userRoles;

    public UserModel(){
    }

    public UserModel(String username, String password, boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public UserModel(String username, String password, boolean enabled, Set<UserRole> userRoles) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.userRoles = userRoles;
    }
}
