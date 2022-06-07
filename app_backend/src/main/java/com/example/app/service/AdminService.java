package com.example.app.service;


import java.util.List;

import com.example.app.entity.Admin;
import com.example.app.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepo;

    public List<Admin> getAllAdmins(){
        return adminRepo.findAll();
    }
}
