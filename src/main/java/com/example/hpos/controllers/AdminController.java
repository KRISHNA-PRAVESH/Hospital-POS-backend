package com.example.hpos.controllers;

import com.example.hpos.entities.Doctor;
import com.example.hpos.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

    @Autowired
    private DoctorService doctorService;

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

    @PostMapping("/admin/add-doctor")
    @ResponseBody
    public Doctor addTest(@ModelAttribute Doctor doctor){
        return doctorService.saveDoctor(doctor);
    }





}
