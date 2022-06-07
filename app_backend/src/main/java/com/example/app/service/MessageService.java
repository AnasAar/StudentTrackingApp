package com.example.app.service;


import com.example.app.entity.Message;
import com.example.app.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepo;

    public List<Message> getAllMessages(){
        return messageRepo.findAll();
    }

    public void addMessage(Message message){
        messageRepo.save(message);
    }
}
