package com.example.app.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("professeur")
public class Proffeseur extends User{


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Classe> classes;

    @OneToMany()
    private List<Message> sentMessages;

    public List<Message> getSentMessages() {
        return sentMessages;
    }

    public void setSentMessages(List<Message> sentMessages) {
        this.sentMessages = sentMessages;
    }
}
