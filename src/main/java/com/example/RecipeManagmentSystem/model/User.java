package com.example.RecipeManagmentSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "username is required")
    private String userName;

    @NotBlank(message = "passWord Required")
    private String passWord;

    @NotBlank(message = "email required")
    @Email(message = "valid email required")
    private String email;


    @OneToMany
    private List<Comment> comment;

    @OneToMany
    private List<Recipe> recipe;

}
