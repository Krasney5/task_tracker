package com.example.Task.Services;

import org.springframework.stereotype.Service;

@Service
public class TaskService extends TaskRepository{
    
    private TaskRepository repository;

    public List<Task> findByUserName(String name){
        
    }

    public Task saveTask(Task task){


        repository.save(task)
        return task;
    }
    public Task updateTask(Task task){

    }

    public void delete(Task task){

    }

}
