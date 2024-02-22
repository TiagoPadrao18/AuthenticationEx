package com.authorizationEx.authorzationEx.controller;

import com.authorizationEx.authorzationEx.dto.UserDto;
import com.authorizationEx.authorzationEx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.authorizationEx.authorzationEx.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody UserDto userDto){
        return this.userService.createUser(userDto);

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUsers(){
            return userService.getAllUsers();
    }


    @GetMapping("/home")
    @ResponseStatus(HttpStatus.OK)
    public String welcome(){
        return "home";
    }

    @GetMapping("/home/admin")
    @ResponseStatus(HttpStatus.OK)
    public String welcomeAdmin(){
        return "home_admin";
    }

    @GetMapping("/home/user")
    @ResponseStatus(HttpStatus.OK)
    public String welcomeUser(){
        return  "home_user";
    }
}
