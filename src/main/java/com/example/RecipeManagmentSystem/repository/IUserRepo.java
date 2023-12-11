package com.example.RecipeManagmentSystem.repository;

import com.example.RecipeManagmentSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
