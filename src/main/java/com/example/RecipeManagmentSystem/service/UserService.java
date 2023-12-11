package com.example.RecipeManagmentSystem.service;

import com.example.RecipeManagmentSystem.DTO.LoginDto;
import com.example.RecipeManagmentSystem.exception.InvalidLoginException;
import com.example.RecipeManagmentSystem.model.User;
import com.example.RecipeManagmentSystem.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepo IUserRepo;

    public User getUserById(Long userId) {
        return IUserRepo.findById(userId).orElse(null);
    }

    public User createUser(User user) {
        return IUserRepo.save(user);
    }

    public User updateUser(Long userId, User updatedUser) {
        if (IUserRepo.existsById(userId)) {
            updatedUser.setUserId(userId);
            return IUserRepo.save(updatedUser);
        }else{
            return null;
        }
    }


    public void deleteUserById( Long userId) {
        IUserRepo.deleteById(userId);
    }

    public User loginUser(LoginDto loginDto) {
        User user = IUserRepo.findByEmail(loginDto.getEmail());
        if(user != null && user.getPassWord().equals(loginDto.getPassWord())){
            return user;
        }else{
            throw new InvalidLoginException("Invalid Email or password");
        }
    }
}

