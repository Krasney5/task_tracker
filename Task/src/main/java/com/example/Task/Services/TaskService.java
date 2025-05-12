package com.example.Task.Services;

import com.example.Task.Models.Task;
import com.example.Task.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService{

    @Autowired
    private TaskRepository repository;

    public Task saveTask(Task task){
        //логика автоматической выставки времени
        return repository.save(task);
    }

    public List<Task> findTaskByUserName(String userName){
        return repository.findByUserName(userName);
    }
}
