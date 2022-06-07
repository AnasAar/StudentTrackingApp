package com.example.app.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class RoussourceNotFoundException extends RuntimeException{

    public RoussourceNotFoundException(String message) {
        super(message);
    }
}
