package com.example.tracker;

import com.example.tracker.model.Classe;

import java.io.Serializable;
import java.util.Date;



public class Devoir implements Serializable {

    private Long id;
    private String matiere;
    private Date date;

    private Classe classe;

    private Professeur prof;


    private String content;

    public Devoir(String matiere, Date date) {
        this.matiere = matiere;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Professeur getProf() {
        return prof;
    }

    public void setProf(Professeur prof) {
        this.prof = prof;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
