package com.example.Task.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import java.time.LocalDate;

@Entity
@Getter
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private String userName;
    private LocalDate timeOfCreation;
    private boolean isCompleted;

    public void setTimeOfCreation(LocalDate localDate){
        timeOfCreation = localDate;
    }

    public LocalDate getTimeOfCreation() {
        return timeOfCreation;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public int getId() {
        return id;
    }
}
