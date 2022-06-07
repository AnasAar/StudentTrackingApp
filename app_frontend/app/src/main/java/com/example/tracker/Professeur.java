package com.example.tracker;

import androidx.annotation.StringRes;

import com.example.tracker.model.Classe;
import com.example.tracker.model.User;

import java.util.Date;
import java.util.List;


public class Professeur extends User {

    private String matiere;

    private List<Classe> classes;



    public Professeur( String matiere) {
        this.matiere = matiere;
    }


    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public List<Classe> getClasses() {
        return classes;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }


    public String getMatiere() {
        return matiere;
    }

}
