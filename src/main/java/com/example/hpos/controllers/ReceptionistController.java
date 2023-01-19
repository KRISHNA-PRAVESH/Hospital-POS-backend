package com.example.hpos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;



@Controller
//@RequestMapping("/receptionlist")
public class ReceptionistController {


    //Receptionist dashboard

    @GetMapping("/receptionist/dashboard")
    public String dashboard(){
        return "Receptionist-page/dashboard";
    }

    //New patient
    @GetMapping("/receptionist/new-patient")
    public String newPatient(){
        return "Receptionist-page/new-patient";
    }

    //Doctor's list
    @GetMapping("/receptionist/doctor-list")
    public String doctorsList(){
        return "Receptionist-page/doctor-list";
    }

    //Book an appointment
    @GetMapping("/receptionist/book-an-appointment")
    public String bookAnAppointment(){
        return "Receptionist-page/book-appointment";
    }

   

    
    
}
