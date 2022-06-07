package com.example.app.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class Admin extends User{

    private String role;

    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return this.role;
    }
}
