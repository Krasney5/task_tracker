package com.example.Task.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TaskController {

    @GetMapping("/tasks/{userName}")
    public String allTasks(@PathVariable String userName){
        return "not have task";
    }
}
