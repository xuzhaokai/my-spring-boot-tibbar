package com.shp.mytibbar.controller;

import com.shp.mytibbar.model.User;
import com.shp.mytibbar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;          // 用户服务层

    @RequestMapping("/aaAA")
    public String sayHello() {
        return "Hello,World!????";
    }

    @RequestMapping("list")
    public List<User> list(){
        List<User> list = userService.getAllUsers();
        return list;
    }

    @RequestMapping("create")
    public User create(){
        return userService.create("xuzhaokai", "123456");
    }
}
