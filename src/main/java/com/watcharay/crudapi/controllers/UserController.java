package com.watcharay.crudapi.controllers;

import com.watcharay.crudapi.entity.User;
import com.watcharay.crudapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api") // for set base url
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id){
        User user = userService.findById(id);
        if (user==null){
            throw new RuntimeException("user [" + id + "] not found");
        }
        return user;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable String id){

        User user = userService.findById(id);
        if (user == null){
            throw new RuntimeException("user [" + id + "] not found");
        }
        userService.deleteById(id);
        return "delete user [" + id + "] success";
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        return userService.save(user);
    }
}
