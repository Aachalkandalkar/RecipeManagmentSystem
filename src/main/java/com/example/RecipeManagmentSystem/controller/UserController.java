package com.example.RecipeManagmentSystem.controller;

import com.example.RecipeManagmentSystem.DTO.LoginDto;
import com.example.RecipeManagmentSystem.model.User;
import com.example.RecipeManagmentSystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController   // handle incoming HTTP request
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //log in
    @PostMapping("/login")
    public User loginUser(@RequestBody LoginDto loginDto){
        return userService.loginUser(loginDto);
    }


    //get user by id
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }
    // create user
    @PostMapping("/create")
    public User createUser(@RequestBody User user){
       return userService.createUser(user);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId , @Valid @RequestBody User updatedUser){
       return userService.updateUser(userId,updatedUser);
    }

    @DeleteMapping("/{userId}")
    public void deleteUserById(@PathVariable Long userId){
        userService.deleteUserById(userId);
    }
}
