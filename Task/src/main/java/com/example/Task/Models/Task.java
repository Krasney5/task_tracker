package com.example.Task.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

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

    public int getId() {
        return id;
    }
    public void setTimeOfCreation(LocalDate localDate){
        timeOfCreation = localDate;
    }

    public LocalDate getTimeOfCreation() {
        return timeOfCreation;
    }
}
