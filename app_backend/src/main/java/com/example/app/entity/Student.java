package com.example.app.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.List;
import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String codeMassar;
    private String name;

    @ManyToOne
    private Classe classe;

    @ManyToOne
    private Tuteur tuteur;

    @OneToMany(targetEntity = Note.class,mappedBy = "etudiant")
    private List<Note> notes;


    @OneToMany(targetEntity = Abssence.class,mappedBy = "etudiant")
    private List<Abssence> absences;

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Long getId() {
        return id;
    }

    public String getCodeMassar() {
        return codeMassar;
    }

    public void setCodeMassar(String codeMassar) {
        this.codeMassar = codeMassar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public void setTuteur(Tuteur tuteur) {
        this.tuteur = tuteur;
    }

    public List<Abssence> getAbsences() {
        return absences;
    }

    public void setAbsences(List<Abssence> absences) {
        this.absences = absences;
    }
}
