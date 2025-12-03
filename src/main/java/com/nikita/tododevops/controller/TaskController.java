package com.nikita.tododevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/tasks")
    public List<String> getTasks() {
        return List.of(
                "2212",
                "ГОЙДА",
                "67",
                "Дворецков"
        );
    }
}