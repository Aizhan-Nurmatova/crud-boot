package com.aizhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/main-page")
    public String mainController(){
        return "main-page";
    }

    @GetMapping("/admin-page")
    public String adminPage(){
        System.out.println("users");
        return "users";
    }
}
