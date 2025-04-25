package com.example.Task.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Task {
    @Id
    private int id;
    private String description;
    private String userName;
    private LocalDate timeOfCreation;
}
