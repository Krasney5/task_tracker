package com.example.Task.Services;

import com.example.Task.Models.Task;
import com.example.Task.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TaskService{

    public Task saveTask(Task task);
    public List<Task> findTaskByUserName(String userName);
    public Task updateTask(Task task);
    public String deleteById(long id);
}
