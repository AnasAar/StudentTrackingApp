package com.example.app.service;

import java.util.List;

import com.example.app.entity.Devoir;
import com.example.app.repository.DevoirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevoirService {


    @Autowired
    private DevoirRepository devoirRepo;

    public List<Devoir> getAllDevoirs(){
        return devoirRepo.findAll();
    }

    public Devoir save(Devoir devoir) {
        devoirRepo.save(devoir);
        return devoir;
    }
}
