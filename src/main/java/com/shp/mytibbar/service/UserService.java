package com.shp.mytibbar.service;

import com.shp.mytibbar.model.User;

import java.util.List;

public interface UserService {

    void login();

    User create(String name, String password);

    List<User> getAllUsers();
}
