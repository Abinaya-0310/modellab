package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.domain.*;


@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/login")
    public String showForm() {
        return  "login";
    }
    @PostMapping("/login")
    public String checkLogin(@RequestParam String Username,@RequestParam String Password,Model model) {
        //TODO: process POST request
        User user=userService.validate(Username, Password);
        if(user!=null) {
            model.addAttribute("name", Username);
            return "home";
        }
        else{
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
    
    
}
