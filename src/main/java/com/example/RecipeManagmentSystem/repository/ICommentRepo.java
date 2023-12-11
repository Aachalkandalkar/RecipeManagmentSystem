package com.example.RecipeManagmentSystem.repository;

import com.example.RecipeManagmentSystem.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // data access and interact with the database
public interface ICommentRepo extends JpaRepository<Comment, Long> {
}
