package com.example.app.controller;


import com.example.app.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin")
public class AdminController {


    @Autowired
    private AdminService adminService;

    @GetMapping("/alladmins")
    public ResponseEntity<?> getAllAdmins(){
        return ResponseEntity.ok(adminService.getAllAdmins());
    }
}
