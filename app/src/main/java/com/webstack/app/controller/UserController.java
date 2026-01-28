package com.webstack.app.controller;

import com.webstack.app.entity.User;
import com.webstack.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create/user")
    public String createUser(@RequestBody User user){
        System.out.println(user.getName());

        userService.userSave(user);
        return "User Created";
    }
}
