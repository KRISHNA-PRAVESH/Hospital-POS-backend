package com.example.hpos.services;

import com.example.hpos.entities.Employee;
import com.example.hpos.repositories.EmployeeRepository;
import com.example.hpos.repositories.SpecialistRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final SpecialistRepository specialistRepository;

    public EmployeeService(EmployeeRepository employeeRepository, SpecialistRepository specialistRepository) {
        this.employeeRepository = employeeRepository;
        this.specialistRepository = specialistRepository;
    }



}
