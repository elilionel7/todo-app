package com.example.todolist.model;

import javax.persistence.*;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String priority; // High, Medium, Low

    @ManyToOne
    private User user;

    // getters and setters
}