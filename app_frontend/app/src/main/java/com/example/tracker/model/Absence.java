package com.example.tracker.model;

import com.example.tracker.Professeur;

import java.util.Date;

public class Absence {

    private Long id;

    private Date date_abssence;

    private Student etudiant;

    private Professeur prof;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate_abssence() {
        return date_abssence;
    }

    public void setDate_abssence(Date date_abssence) {
        this.date_abssence = date_abssence;
    }

    public Student getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Student etudiant) {
        this.etudiant = etudiant;
    }

    public Professeur getProf() {
        return prof;
    }

    public void setProf(Professeur prof) {
        this.prof = prof;
    }
}
