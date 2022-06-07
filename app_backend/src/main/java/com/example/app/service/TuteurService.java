package com.example.app.service;


import java.util.List;
import java.util.stream.Collectors;

import com.example.app.entity.Student;
import com.example.app.entity.Tuteur;
import com.example.app.entity.User;
import com.example.app.repository.TuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TuteurService {

    @Autowired
    private TuteurRepository tuteurRepo;

    @Autowired StudentService studentService;

    public List<Tuteur> getAllTuteurs(){
        return tuteurRepo.findAll();
    }

    public Tuteur getTuteurByEmail(String email){

        List<Tuteur> list=tuteurRepo.findAll()
                .stream()
                .filter(l->l.getUserName().equals(email))
                .collect(Collectors.toList());
        if(list.size()==0){
            Tuteur t=new Tuteur();
            t.setNumberPhone("000000");
            t.setName("kkkkkk");
            t.setUserName("llkmlk");
            return t;
        }
        return list.get(0);
    }

    public Tuteur save(Tuteur tuteur){
        tuteur.setRole("tuteur");
        tuteurRepo.save(tuteur);
        return tuteur;
    }

    public Tuteur addChild(int idstudent, int idstudent1) {
        Student student=studentService.getById(Long.valueOf(idstudent));
        Tuteur tuteur=tuteurRepo.findById(Long.valueOf(idstudent)).get();

        if(student==null){
            return null;
        }
        else if(tuteur==null){
            return  null;
        }
        else {
            tuteur.getEnfants().add(student);
            tuteurRepo.save(tuteur);
            return tuteur;
        }
    }
}
