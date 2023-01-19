package com.example.hpos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    
    //Dashboard
    @GetMapping("/doctor/dashboard")
    public String dashboard(){
        return "doctor-page/dashboard";
    }

    //Patients
    @GetMapping("/doctor/patients")
    public String patients(){
        return "doctor-page/patients";
    }

    //Prescription
    @GetMapping("/doctor/prescription")
    public String prescription(){
        return "doctor-page/prescription";
    }
}
