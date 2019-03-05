package com.shp.mytibbar.service.impl;

import com.shp.mytibbar.mapper.UserMapper;
import com.shp.mytibbar.model.User;
import com.shp.mytibbar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void login() {
    }


    @Override
    public User create(String name, String password) {
        return userMapper.insert(name,password);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

//    @Override
//    public void deleteByName(String name) {
//    }
//
//    @Override
//    public Integer getAllUsers() {
//    }
//
//
//    @Override
//    public void deleteAllUsers() {
//    }
}
