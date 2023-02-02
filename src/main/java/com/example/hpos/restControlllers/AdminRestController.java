package com.example.hpos.restControlllers;

import com.example.hpos.dto.DoctorDTO;
import com.example.hpos.entities.Employee;
import com.example.hpos.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminRestController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/admin/add-doctor")
    public Employee addTest(@ModelAttribute DoctorDTO doctor){
        return employeeService.saveDoctor(doctor);
    }

}
