package com.bellacore.eshopping.controller;

import com.bellacore.eshopping.dto.userDto.UserAuthDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

///eshopping/api/v1
@RestController
public class HomeController {

    @GetMapping("/sample")
    public String index(){
        return "Hello welcome to customer app";
    }

    @PostMapping("/login")
    public String login(){
        return "login";
    }

//    @GetMapping("/admin")
//    public String adminPage(){
//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(uri);
//
//        Map<String, String> message = new HashMap<>();
//        message.put("userId", user.getUserId());
//        message.put("url", uri.toString())
//        return new ResponseEntity<void>(null, headers, HttpStatus.CREATED)
//    }

    @GetMapping("/profile")
    public String managerPage(){
        return "users only";
    }
}
