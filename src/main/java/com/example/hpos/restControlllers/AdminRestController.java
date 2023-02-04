package com.example.hpos.restControlllers;

import com.example.hpos.services.DoctorService;
import com.example.hpos.services.EmployeeService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminRestController {
    private final EmployeeService employeeService;
    private final DoctorService doctorService;

    public AdminRestController(EmployeeService employeeService, DoctorService doctorService) {
        this.employeeService = employeeService;
        this.doctorService = doctorService;
    }

//    @PostMapping("/admin/add-doctor")
//    public Employee addTest(@ModelAttribute DoctorDTO doctor){
//        return employeeService.saveDoctor(doctor);
//    }

}
