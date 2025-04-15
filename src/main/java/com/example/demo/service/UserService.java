package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    public User validate(String Username,String Password) {
        return repo.findByUsernameAndPassword(Username,Password);
    }
}
