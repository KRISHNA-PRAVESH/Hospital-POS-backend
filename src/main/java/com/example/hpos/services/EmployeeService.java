package com.example.hpos.services;

import com.example.hpos.dto.DoctorDTO;
import com.example.hpos.entities.Employee;
import com.example.hpos.entities.Specialist;
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

    public Employee saveDoctor(DoctorDTO doctor) {

        Employee employee = new Employee(doctor);
        Specialist specialist = new Specialist(employee.getEId(),doctor.getSpecialist());
        specialistRepository.save(specialist);
        return employeeRepository.save(employee);
    }

}
