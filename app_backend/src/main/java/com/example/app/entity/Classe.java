package com.example.app.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String nom;

    private int nbr_etudiants;

    public List<Proffeseur> getProfesseurs() {
        return professeurs;
    }

    public void setProfesseurs(List<Proffeseur> professeurs) {
        this.professeurs = professeurs;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Proffeseur> professeurs;

    @OneToMany(targetEntity = Student.class, mappedBy = "classe")
    private List<Student> etudiants_classe;

    public List<Devoir> getDevoirs() {
        return devoirs;
    }

    public void setDevoirs(List<Devoir> devoirs) {
        this.devoirs = devoirs;
    }

    @OneToMany(targetEntity = Devoir.class, mappedBy = "classe")
    private List<Devoir> devoirs;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbr_etudiants() {
        return nbr_etudiants;
    }

    public void setNbr_etudiants(int nb_etudiants) {
        this.nbr_etudiants = nb_etudiants;
    }

    public void setEtudiants_classe(List<Student> etudiants_classe) {
        this.etudiants_classe = etudiants_classe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
