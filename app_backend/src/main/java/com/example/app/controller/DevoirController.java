package com.example.app.controller;


import com.example.app.entity.Devoir;
import com.example.app.service.DevoirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/devoir")
public class DevoirController {

    @Autowired
    private DevoirService devoirService;

    @GetMapping("/allDevoirs")
    public ResponseEntity<?> getAllDevoirs(){
        return ResponseEntity.ok(devoirService.getAllDevoirs());
    }

    @PostMapping("save")
    public Devoir save(@RequestBody Devoir devoir){
        return devoirService.save(devoir);
    }
}
