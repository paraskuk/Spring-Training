package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Value("${app.greeting}")
    private String greeting;

    @Autowired
    public GreetingService(){
        super();

    }


    public String getGreeting(String name){
        return greeting + " " + name;
    }
}