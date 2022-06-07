package com.example.tracker.model;

import com.example.tracker.Enfant;

import java.io.Serializable;
import java.util.List;

public class Tuteur extends User implements Serializable {

    private String numberPhone;

    List<Student> enfants;

    public List<Student> getEnfants() {
        return enfants;
    }

    public void setEnfants(List<Student> enfants) {
        this.enfants = enfants;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}
