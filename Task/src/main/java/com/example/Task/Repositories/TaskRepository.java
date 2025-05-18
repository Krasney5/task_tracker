package com.example.Task.Repositories;


import com.example.Task.Models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

    public List<Task> findByUserName(String name);

    public void deleteById(long id);

}
