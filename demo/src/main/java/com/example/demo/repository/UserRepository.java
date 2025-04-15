package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.User;
public interface UserRepository<User> extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String Username,String Password);

}
