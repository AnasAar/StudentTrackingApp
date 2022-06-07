package com.example.app.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Devoir {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String matiere;
    private Date date_devoir;

    @ManyToOne
    private Classe classe;
    @ManyToOne
    private Proffeseur prof;

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

    public Date getDate_devoir() {
        return date_devoir;
    }

    public void setDate_devoir(Date date_devoir) {
        this.date_devoir = date_devoir;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Proffeseur getProf() {
        return prof;
    }

    public void setProf(Proffeseur prof) {
        this.prof = prof;
    }
}
