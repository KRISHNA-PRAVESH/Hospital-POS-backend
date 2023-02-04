package com.example.hpos.services;

import com.example.hpos.entities.Doctor;
import com.example.hpos.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}
