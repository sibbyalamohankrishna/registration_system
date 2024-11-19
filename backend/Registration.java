package com.example.registration.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;

    @Column(updatable = false)
    private LocalDate registrationDate = LocalDate.now();
}
