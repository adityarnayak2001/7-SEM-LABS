package com.example.DepIngExJunit.service;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Dependency Injection & Testing";
    }
}