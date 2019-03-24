package com.uabc.database.example.examplejpa.components;

import com.uabc.database.example.examplejpa.entity.User;
import com.uabc.database.example.examplejpa.model.UserModel;
import org.springframework.stereotype.Component;

@Component("userConverter")
public class UserConverter {
    public User convertUserModel2User(UserModel userModel){

        User user = new User();
        user.setUsername(userModel.getUsername());
        user.setPassword(userModel.getPassword());
        user.setEnabled(userModel.getEnabled());
        if(userModel.getUserRoles() != null){
            user.setUserRoles(userModel.getUserRoles());
        }

        return user;
    }

    public UserModel convertUser2UserModel(User user){

        UserModel userModel = new UserModel();
        userModel.setUsername(user.getUsername());
        userModel.setPassword(user.getPassword());
        userModel.setEnabled(user.isEnabled());
        if (user.getUserRoles() != null){
            userModel.setUserRoles(user.getUserRoles());
        }
        return userModel;
    }

}
