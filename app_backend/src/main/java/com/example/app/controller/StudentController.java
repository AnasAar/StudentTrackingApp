package com.example.app.controller;


import com.example.app.entity.Student;
import com.example.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/allstudents")
    public ResponseEntity<?> getStudents(){
        List<Student> list=service.getStudents();
        return ResponseEntity.ok(list);
    }
    @PostMapping("save")
    public Student save(@RequestBody Student student){
        return service.save(student);
    }
    @GetMapping("/setclass/{idclasse}/{idstudent}")
    public Student setClass(@PathVariable("idclasse") int idclasse,@PathVariable("idstudent") int idstudent){
        return service.setClasse(idclasse,idstudent);
    }

}
