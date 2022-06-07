package com.example.app.service;


import com.example.app.entity.Abssence;
import com.example.app.repository.AbssenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbssenceService {

    @Autowired
    private AbssenceRepository absenceRepo;

    public List<Abssence> getAllAbssence(){
        return absenceRepo.findAll();
    }
}
