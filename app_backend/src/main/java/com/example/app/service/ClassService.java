package com.example.app.service;


import com.example.app.entity.Classe;
import com.example.app.entity.Proffeseur;
import com.example.app.repository.ClassRepository;
import com.example.app.repository.ProfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService {

    @Autowired
    private ClassRepository classRepo;

    @Autowired
    private ProfRepository profRepository;
    public List<Classe> getAllClasses(){
        return classRepo.findAll();
    }

    public Classe save(Classe classe){
        classRepo.save(classe);
        return classe;
    }

    public Classe addProf(Long classid, Long profid) {

        Optional<Classe> classe=classRepo.findById(classid);
        Optional<Proffeseur> proffeseur=profRepository.findById(profid);
        if(!classe.isPresent()){
            return null;
        }
        if(!proffeseur.isPresent()){
            return null;
        }
        else{
            classe.get().getProfesseurs().add(proffeseur.get());
            classRepo.save(classe.get());
            return classe.get();
        }
    }
    public Classe findById(Long id){
        return classRepo.findById(id).get();
    }
}
