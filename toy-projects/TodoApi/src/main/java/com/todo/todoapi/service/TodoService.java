package com.todo.todoapi.service;

import com.todo.todoapi.domain.Todo;
import com.todo.todoapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Transactional
    public void saveTodo(String subject) {
        Todo todo = new Todo();
        todo.setCompleted(true);
        todo.setSubject(subject);
        todoRepository.save(todo);
    }

    @Transactional
    public List<Todo> findAllTodos() {
        return todoRepository.findAll();
    }
}
