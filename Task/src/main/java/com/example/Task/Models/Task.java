package com.example.Task.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private String userName;
    private LocalDate timeOfCreation;
    private boolean isCompleted;
}
