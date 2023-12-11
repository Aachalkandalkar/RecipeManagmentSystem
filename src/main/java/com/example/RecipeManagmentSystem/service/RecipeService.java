package com.example.RecipeManagmentSystem.service;

import com.example.RecipeManagmentSystem.model.Recipe;
import com.example.RecipeManagmentSystem.repository.IRecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    @Autowired
    private IRecipeRepo IRecipeRepo;
    public Recipe getRecipeById(Long recipeId) {
        return IRecipeRepo.findById(recipeId).orElse(null);
    }

    public Recipe createRecipe(Recipe recipe) {
        return IRecipeRepo.save(recipe);
    }


    public Recipe updateRecipe(Long recipeId, Recipe updatedRecipe) {
        if(IRecipeRepo.existsById(recipeId)){
            updatedRecipe.setRecipeId(recipeId);
            return IRecipeRepo.save(updatedRecipe);
        }else{
            return null;
        }
    }


    public void deleteRecipeById(Long recipeId) {
        IRecipeRepo.deleteById(recipeId);
    }
}
