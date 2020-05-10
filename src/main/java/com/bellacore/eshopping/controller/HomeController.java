package com.bellacore.eshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

///eshopping/api/v1
@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "Hello welcome to customer app";
    }

    @GetMapping("/admin")
    public String adminPage(){
        return "admins only";
    }

    @GetMapping("/profile")
    public String managerPage(){
        return "users only";
    }
}
