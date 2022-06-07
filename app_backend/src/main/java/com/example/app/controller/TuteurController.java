package com.example.app.controller;

import java.util.List;
import com.example.app.entity.Tuteur;
import com.example.app.service.TuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tuteur")
public class TuteurController {

    @Autowired
    private TuteurService tuteurService;

    @PostMapping("/save")
    public Tuteur save(@RequestBody Tuteur tuteur){
        return tuteurService.save(tuteur);
    }

    @GetMapping("/getby/{email}")
    public Tuteur getTuteurByEmail(@PathVariable String email){
        return tuteurService.getTuteurByEmail(email);
    }

    @GetMapping("/alltuteurs")
    public ResponseEntity<List<Tuteur>> getAllTuteurs(){
        return ResponseEntity.ok(tuteurService.getAllTuteurs());
    }
    @GetMapping("/addchild/{idtuteur}/{idstudent}")
    public Tuteur addChild(@PathVariable("idtuteur") int idtuteur,@PathVariable("idstudent") int idstudent){
        return tuteurService.addChild(idstudent,idstudent);
    }
}
