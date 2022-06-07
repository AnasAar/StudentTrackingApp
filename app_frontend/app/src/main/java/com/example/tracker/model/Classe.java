package com.example.tracker.model;

import com.example.tracker.Devoir;
import com.example.tracker.Professeur;

import java.util.List;

public class Classe {


    private int id;


    private String nom;


    private int nbr_Etudiants;

    private List<Devoir> devoirs;

    private List<Professeur> professeurs;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbr_Etudiants() {
        return nbr_Etudiants;
    }

    public void setNbr_Etudiants(int nbr_Etudiants) {
        this.nbr_Etudiants = nbr_Etudiants;
    }


    public int getId() {
        return id;
    }

    public List<Devoir> getDevoirs() {
        return devoirs;
    }

    public void setDevoirs(List<Devoir> devoirs) {
        this.devoirs = devoirs;
    }

    public List<Professeur> getProfesseurs() {
        return professeurs;
    }

    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }
}
