package com.example.DepIngExJunit.controller;

import com.example.DepIngExJunit.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class DepIngExJunitController {
    //field-based dependency injection
    @Autowired
    GreetingService greetingService;


    @RequestMapping(value="/", method = RequestMethod.GET)
    public String home()
    {
        return greetingService.greet();
    }


}
