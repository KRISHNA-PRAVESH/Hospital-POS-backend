package com.example.hpos.controllers;

import com.example.hpos.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/test")
    public String test(){
        System.out.println("test controller");
        return "index";
    }
    @GetMapping("/home")
    @ResponseBody
    public String hey(){
        return "Home";
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
