package com.example.employeemanagement.entity;

import jakarta.persistence.*;
import java.util.Date;
import lombok.*;

@Data
@Entity
@Table(name = "tcs_employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @NonNull
    @Column(name = "name")
    private String name;

    @NonNull
    @Column(name = "gender")
    private String gender;

    @NonNull
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @NonNull
    @Column(name = "address")
    private String address;

    @NonNull
    @Column(name = "email")
    private String email;

    @Column(name = "picture")
    private byte[] picture;
}
