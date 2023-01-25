package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("users")
    public User createUser(@RequestBody User user){
        return service.createUser(user);
    }

    @GetMapping("users/{id}")
    public User getUserById(@PathVariable Long id){
       return service.searchUserById(id);
    }
}
