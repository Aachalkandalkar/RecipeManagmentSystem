package com.example.RecipeManagmentSystem.service;

import com.example.RecipeManagmentSystem.model.Comment;
import com.example.RecipeManagmentSystem.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // purpose to provide buisness logic
public class CommentService {

    @Autowired
    private ICommentRepo ICommentRepo;

    public List<Comment> getAllComment() {
     return ICommentRepo.findAll();
    }

    public Comment getCommentById(Long commentId) {
        return ICommentRepo.findById(commentId).orElse(null);
    }

    public Comment createComment(Comment comment) {
        return ICommentRepo.save(comment);
    }


    public Comment updateComment(Long commentId, Comment updatedComment) {
        if(ICommentRepo.existsById(commentId)){
            updatedComment.setCommentId(commentId);
            return ICommentRepo.save(updatedComment);
        }else{
            return null;
        }
    }


    public void deleteCommentById(Long commentId) {
        ICommentRepo.deleteById(commentId);
    }

}
