package com.example.RecipeManagmentSystem.controller;

import com.example.RecipeManagmentSystem.model.Comment;
import com.example.RecipeManagmentSystem.service.CommentService;
import jakarta.validation.Valid;
import org.hibernate.binder.internal.CommentsBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/getAll")
    public List<Comment> getAllComment(){
        return commentService.getAllComment();
    }

    @GetMapping("/{commentId}")
    public Comment getCommentById(@PathVariable Long commentId){
        return commentService.getCommentById(commentId);
    }

    @PostMapping("/create")
    public Comment createComment(@RequestBody Comment comment){
        return commentService.createComment(comment);
    }

    @PutMapping("/{commentId}")
    public Comment updateComment(@PathVariable Long commentId , @Valid @RequestBody Comment updatedComment){
        return commentService.updateComment(commentId , updatedComment);
    }

    @DeleteMapping("/{commentId}")
    public void deleteCommentById(@PathVariable  Long commentId){
        commentService.deleteCommentById(commentId);
    }
}
