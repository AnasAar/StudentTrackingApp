package com.example.app.controller;


import com.example.app.entity.Classe;
import com.example.app.entity.Proffeseur;
import com.example.app.service.ClassService;
import com.example.app.service.ProfesseurService;
import org.hibernate.annotations.common.util.impl.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/classe")
public class ClassController {

    @Autowired
    private ClassService classService;

    @Autowired
    ProfesseurService professeurService;

    @GetMapping("/allclasses")
    public ResponseEntity<?> getAllClasses(){
        List<Classe> list=classService.getAllClasses();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/save")
    public Classe save(@RequestBody Classe classe){
        return classService.save(classe);
    }

    @GetMapping("/addprof/{classeid}/{profid}")
    public Classe addProf(@PathVariable("classeid") int classid,@PathVariable("profid") int profid){

        return classService.addProf(Long.valueOf(classid),Long.valueOf(profid));
    }

    @GetMapping("/getclasseby/{idprof}")
    public List<Classe> getClassesByProfId(@PathVariable Long id){
        Proffeseur proffeseur=professeurService.getById(id);
        List<Classe> list=classService.getAllClasses();
        return list.stream()
                .filter(c->c.getProfesseurs().contains(proffeseur))
                .collect(Collectors.toList());
    }
}
