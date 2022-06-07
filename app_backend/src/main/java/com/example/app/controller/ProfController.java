package com.example.app.controller;


import com.example.app.entity.Proffeseur;
import com.example.app.service.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prof")
public class ProfController {

    @Autowired
    private ProfesseurService profservice;

    @GetMapping("/allprofs")
    public ResponseEntity<?> getAllprofs(){
        List<Proffeseur> list=profservice.getAllProfesseur();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/save")
    public Proffeseur save(@RequestBody Proffeseur prof){
        return profservice.save(prof);
    }

    @GetMapping("/getby/{email}")
    public Proffeseur getByEmail(@PathVariable("email") String email){
        return profservice.getByEmail(email);
    }

    @GetMapping("/deleteall")
    public void deleteAll(){
        profservice.deleteAll();
    }
}
