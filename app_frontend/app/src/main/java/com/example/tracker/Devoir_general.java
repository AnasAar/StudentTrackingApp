package com.example.tracker;

import java.util.Date;



public class Devoir_general {
    private String matiere;
    private String date;
    private String enfant;

    public Devoir_general(String matiere, String date, String enfant) {
        this.matiere = matiere;
        this.date = date;
        this.enfant = enfant;
    }

    public String getMatiere() {
        return matiere;
    }



    public String getDate() {
        return date;
    }

    public String getEnfant() {
        return enfant;
    }
}
