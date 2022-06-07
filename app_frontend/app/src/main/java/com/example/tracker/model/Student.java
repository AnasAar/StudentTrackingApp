package com.example.tracker.model;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {



    private String name;

    private String codeMassar;

    private Classe classe;

    private Tuteur tuteur;

    private List<Absence> absences;

    private List<Note> notes;

    public Student(String name){
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeMassar() {
        return codeMassar;
    }

    public void setCodeMassar(String codeMassar) {
        this.codeMassar = codeMassar;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Tuteur getTuteur() {
        return tuteur;
    }

    public void setTuteur(Tuteur tuteur) {
        this.tuteur = tuteur;
    }

    private int id;

    public List<Absence> getAbsences() {
        return absences;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public void setAbsences(List<Absence> absences) {
        this.absences = absences;
    }
}
