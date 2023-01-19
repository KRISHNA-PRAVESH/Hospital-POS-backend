package com.example.hpos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PharamacistController {
    @GetMapping("/pharmacist/dashboard")
    public String dashboard(){
        return "pharmacist-page/dashboard";
    }


    //Add medicines
    @GetMapping("/pharmacist/add-medicines")
    public String addMedicines(){
        return "pharmacist-page/add-medicines";
    }

    //Check stocks
    @GetMapping("/pharmacist/stocks")
    public String stocks(){
        return "pharmacist-page/stocks";
    }

    //Check prescription prescribed by doctor
    @GetMapping("/pharmacist/prescription")
    public String prescription(){
        return "pharmacist-page/prescription";
    }

    //Patient checkout and billing
    @GetMapping("/pharmacist/check-out")
    public String checkOut(){
        return "pharmacist-page/check-out";
    }




}
