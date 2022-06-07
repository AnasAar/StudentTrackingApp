package com.example.tracker;

import java.util.Date;



public class Message {
    private String NomExpediteur;
    private String Date;


    public Message(String Nom, String date) {
        this.NomExpediteur = Nom;
        this.Date = date;
    }

    public String getNomExpediteur() {
        return NomExpediteur;
    }

    public String getDate() {
        return Date;
    }




}
