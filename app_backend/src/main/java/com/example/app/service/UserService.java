package com.example.app.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.app.entity.User;
import com.example.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User getUser(String email, String password){

        List<User> list=userRepository.findAll()
                .stream()
                .filter(l->l.getUserName().equals(email) && l.getPassword().equals(password))
                .collect(Collectors.toList());
        if(list.size()!=0){
            return list.get(0);
        }
        else{
            return null;
        }
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
