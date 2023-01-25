package com.example.service;

import com.example.entity.User;
import com.example.exception.UserNotFoundException;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User createUser(User user){
        return repository.save(user);
    }

    public User searchUserById(Long id){
        return repository.findById(id).orElseThrow(()-> new UserNotFoundException("user not found with the given id "+id));
    }

}
