// src/main/java/com/example/todolist/repository/TodoRepository.java
package com.example.todolist.repository;

import com.example.todolist.model.Todo;
import com.example.todolist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByUser(User user);
}


