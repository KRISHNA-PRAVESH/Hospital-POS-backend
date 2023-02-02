package com.example.hpos.dto;



import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDTO {

    private int eid;
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
    private String specialist;


}
