package com.example.hpos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/test")
    public String test(){
        System.out.println("test controller");
        return "index";
    }

    @GetMapping("/login")
    public String login(){
      return "login-page/login";
    }

    @GetMapping("/intel")
    @ResponseBody
    public String intel(){
        return "intell";
    }
}
