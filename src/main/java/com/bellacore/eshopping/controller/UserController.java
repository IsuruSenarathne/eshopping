package com.bellacore.eshopping.controller;

import com.bellacore.eshopping.dto.userDto.UserCreateDto;
import com.bellacore.eshopping.entity.User;
import com.bellacore.eshopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/eshopping/api/v1/users")
public class UserController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUser(Model model){
        return userService.getAllUsers();
    }

    @GetMapping(path = "{userId}")
    public Optional<User> getUser(@PathVariable Long userId){
        return userService.getUser(userId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@Valid @RequestBody UserCreateDto userCreateDto){
        userService.saveUser(userCreateDto);
    }

    @PutMapping(path = "{userId}")
    public void UpdateUser(@PathVariable("userId") Long userId){
        System.out.println("get mapping: " + userId);
    }

    @DeleteMapping(path = "{userId}")
    public void DeleteUser(@PathVariable("userId") Long userId, @RequestBody User user){
        System.out.println("get mapping: " + userId);
    }
}
