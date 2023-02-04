package com.example.hpos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

}
