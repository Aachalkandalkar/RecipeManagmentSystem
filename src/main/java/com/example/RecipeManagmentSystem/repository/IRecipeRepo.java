package com.example.RecipeManagmentSystem.repository;

import com.example.RecipeManagmentSystem.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecipeRepo extends JpaRepository<Recipe, Long> {

}
