package com.example.RecipeManagmentSystem.controller;

import com.example.RecipeManagmentSystem.model.Recipe;
import com.example.RecipeManagmentSystem.service.RecipeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Recipe")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/{recipeId}")
    public Recipe getRecipeById(@PathVariable Long recipeId){
        return recipeService.getRecipeById(recipeId);
    }

    @PostMapping("/create")
    public Recipe createRecipe(@RequestBody Recipe recipe){
        return recipeService.createRecipe(recipe);
    }

    @PutMapping("/{recipeId}")
    public Recipe updateRecipe(@PathVariable Long recipeId , @Valid @RequestBody Recipe updatedRecipe ){
        return recipeService.updateRecipe(recipeId,updatedRecipe);
    }

    @DeleteMapping("/{recipeId}")
    public void deleteRecipeById(Long recipeId){
        recipeService.deleteRecipeById(recipeId);
    }
}
