package com.todo.todoapi.controller;

import com.todo.todoapi.domain.Todo;
import com.todo.todoapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class TodoApiController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/test/todos")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<Todo> getTodo() {
        return todoService.findAllTodos();
    }

    @PostMapping("/add/todo")
    public String saveTodo(@RequestBody Map<String,String> content) {
        System.out.println(content.get("subject"));
        todoService.saveTodo(content.get("subject"));
        return "save complet";
    }

}
