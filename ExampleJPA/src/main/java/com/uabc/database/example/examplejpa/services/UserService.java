package com.uabc.database.example.examplejpa.services;

import com.uabc.database.example.examplejpa.model.UserModel;
import com.uabc.database.example.examplejpa.entity.User;

import java.util.List;

public interface UserService {
    public abstract UserModel addUser(UserModel userModel);

    public abstract List<UserModel> listAllUsers();

    public abstract User findUserByUsername(String username);

    public abstract void removeUser(String username);

    public abstract UserModel findUserByUsernameModel(String username);
}
