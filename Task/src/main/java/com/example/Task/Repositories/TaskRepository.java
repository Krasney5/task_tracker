package com.example.Task.Repositories;


import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

    public List<Task> findByUserName(String name);

    public Task saveTask(Task task);

    public Task updateTask(Task task);

    public void delete(Task task);

}
