package com.example.app.service;

import com.example.app.entity.Note;
import com.example.app.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {


    @Autowired
    private NoteRepository noteRepo;
    public List<Note> getAllNotes(){
        return noteRepo.findAll();
    }
}
