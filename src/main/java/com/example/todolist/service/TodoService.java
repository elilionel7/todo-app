// src/main/java/com/example/todolist/service/TodoService.java
package com.example.todolist.service;

import com.example.todolist.model.Todo;
import com.example.todolist.model.User;
import com.example.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo findById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        todoRepository.deleteById(id);
    }

    public List<Todo> findByUser(User user) {
        return todoRepository.findByUser(user);
    }

    public Todo updateTodo(Long id, Todo updatedTodo) {
        Todo todo = findById(id);
        if (todo != null) {
            todo.setTitle(updatedTodo.getTitle());
            todo.setDescription(updatedTodo.getDescription());
            todo.setPriority(updatedTodo.getPriority());
            return save(todo);
        }
        return null;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(Long id) {
        return findById(id);
    }

    public void deleteTodo(Long id) {
        delete(id);
    }

    public Todo saveTodo(Todo todo) {
        return save(todo);
    }
}

