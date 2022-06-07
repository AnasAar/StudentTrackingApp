package com.example.app.service;

import com.example.app.entity.Proffeseur;
import com.example.app.repository.ProfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfesseurService {

    @Autowired
    private ProfRepository profrepo;

    public List<Proffeseur> getAllProfesseur(){
        return profrepo.findAll();
    }

    public Proffeseur save(Proffeseur prof){
        prof.setRole("professeur");
        profrepo.save(prof);
        return prof;
    }


    public Proffeseur getById(Long id){
        return profrepo.findById(id).get();
    }
    public Proffeseur getByEmail(String email) {
        List<Proffeseur> profs=profrepo.findAll().stream()
                .filter(p->p.getUserName().equals(email))
                .collect(Collectors.toList());
        if(profs.size()==0){
            return null;
        }
        else return profs.get(0);
    }

    public void deleteAll() {
        profrepo.deleteAll();
    }
}
