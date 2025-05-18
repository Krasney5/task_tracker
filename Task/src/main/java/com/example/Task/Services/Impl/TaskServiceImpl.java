package com.example.Task.Services.Impl;

import com.example.Task.Models.Task;
import com.example.Task.Repositories.TaskRepository;
import com.example.Task.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository repository;

    @Override
    public Task saveTask(Task task){
        task.setTimeOfCreation(LocalDate.now());
        return repository.save(task);
    }

    @Override
    public List<Task> findTaskByUserName(String userName){
        return repository.findByUserName(userName);
    }

    @Override
    public String deleteById(long id){
        repository.deleteById(id);
        return "удалено";
    }
}
