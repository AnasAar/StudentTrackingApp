package com.example.app.entity;

import javax.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Double note;
    @ManyToOne
    private Student etudiant;
    @ManyToOne
    private Proffeseur prof;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public Student getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Student etudiant) {
        this.etudiant = etudiant;
    }

    public Proffeseur getProf() {
        return prof;
    }

    public void setProf(Proffeseur prof) {
        this.prof = prof;
    }
}
