package com.example.app.controller;


import com.example.app.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/allnotes")
    public ResponseEntity<?> getAllNotes(){
        return ResponseEntity.ok(noteService.getAllNotes());
    }
}
