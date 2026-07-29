package com.operationphoenix.secureassetmanager.controller;

import com.operationphoenix.secureassetmanager.entity.User;
import com.operationphoenix.secureassetmanager.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public User register(@RequestBody User user){
        return userService.saveUser(user);
    }
}
