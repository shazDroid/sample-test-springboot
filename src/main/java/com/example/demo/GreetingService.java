package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting(String name) {
        if (name == null || name.isBlank()) {
            return "Hello from GreetingService!";
        }
        return "Hello, " + name + "!";
    }

    public String setGreeting(String name){
        return name;
    }

    public String sayHi(){
        return "testing version";
    }
}
