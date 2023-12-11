package com.example.RecipeManagmentSystem.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    @NotBlank(message = "email required")
    @Email(message = "valid email required")
    private String email;

    @NotBlank(message = "passWord Required")
    private String passWord;
}
