package com.example.hpos.entities;

import com.example.hpos.dto.DoctorDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private int EId;
    private String FirstName;
    private String LastName;
    private String Gender;
    private Date DOB;
    private String mobile;
    private String email;
    private String address;
    private String city;
    private String state;
    private String role;


    public Employee(DoctorDTO doctor){
        this.EId = doctor.getEid();
        this.FirstName = doctor.getFirstName();
        this.LastName = doctor.getLastName();
        this.Gender = doctor.getGender();
        this.DOB = doctor.getDOB();
        this.mobile = doctor.getMobile();
        this.email = doctor.getEmail();
        this.address = doctor.getAddress();
        this.city = doctor.getCity();
        this.state = doctor.getState();
        this.role = doctor.getRole();

    }

}
