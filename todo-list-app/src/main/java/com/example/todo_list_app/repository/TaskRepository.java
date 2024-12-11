package com.example.todo_list_app.repository;
import com.example.todo_list_app.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}