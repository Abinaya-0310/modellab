package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Username;
    private String Password;
    // getters and setters
    public void setUsername(String Username){
        this.Username = Username;
    }
    public String getUsername(){
        return this.Username;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
    public String getPassword(){
        return this.Password;
    }
}
