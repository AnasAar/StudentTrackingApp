package com.example.app.controller;

import java.util.List;
import com.example.app.entity.User;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/find/{email}/{password}")
    public User findUser(@PathVariable("email") String email,@PathVariable("password") String password){
        return userService.getUser(email,password);
    }

    @GetMapping("/findall")
    public List<User> getAll(){
        return userService.getAll();
    }
}
