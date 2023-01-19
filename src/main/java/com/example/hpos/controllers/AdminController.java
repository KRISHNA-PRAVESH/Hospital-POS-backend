package com.example.hpos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin/dashboard")
    public String dashboard(){
        return "adminpage/dashboard";
    }

    //Add a new doctor
    @GetMapping("/admin/new-doctor")
    public String addNewDoctor(){
        return "adminpage/newdoctor";
    }

    //Add a new pharmacist
    @GetMapping("/admin/new-pharmacist")
    public String addNewPharmacist(){
        return "adminpage/newpharmacist";
    }

    //Add a new receptionist
    @GetMapping("/admin/new-receptionist")
    public String addNewReceptionist(){
        return "adminpage/newreceptionist";
    }
}
