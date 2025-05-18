package com.example.Task.Controllers;

import com.example.Task.Models.Task;
import com.example.Task.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks/{userName}")
    public List<Task> allTasks(@PathVariable String userName){
        return taskService.findTaskByUserName(userName);
    }

    @PostMapping("/taskCreate")
    public Task createTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }

    @DeleteMapping("task/{id}")
    public void deleteTask(@PathVariable long id){
        taskService.deleteById(id);
    }

}
