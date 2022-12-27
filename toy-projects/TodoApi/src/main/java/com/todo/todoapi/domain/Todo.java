package com.todo.todoapi.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String subject;

    @Column
    private boolean completed;

    public Todo() {

    }


}
