package com.example.app.controller;

import com.example.app.entity.Abssence;
import com.example.app.service.AbssenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/absence")
public class AbssenceController {

    @Autowired
    private AbssenceService absenceservice;

    @GetMapping("/allabsence")
    public ResponseEntity<?> getAllAbsence(){
        List<Abssence> list=absenceservice.getAllAbssence();
        return ResponseEntity.ok(list);
    }
}
