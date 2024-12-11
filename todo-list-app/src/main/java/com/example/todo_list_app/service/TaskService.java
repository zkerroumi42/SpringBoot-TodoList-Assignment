package com.example.todo_list_app.service;
import com.example.todo_list_app.model.Task;
import com.example.todo_list_app.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Task saveTask(Task proprietaire) {
        return repository.save(proprietaire);
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
