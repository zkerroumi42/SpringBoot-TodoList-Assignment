package com.example.todo_list_app.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data // Lombok annotation for getters, setters, and toString
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String telephone;
}