package com.example.app.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("tuteur")
public class Tuteur extends User{

    private String numberPhone;

    @OneToMany(targetEntity = Student.class,mappedBy = "tuteur")
    private List<Student> enfants;

    public List<Student> getEnfants() {
        return enfants;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setEnfants(List<Student> enfants){
        this.enfants=enfants;
    }
    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

}
