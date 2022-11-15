package com.example.dependecyInjection.controller;

import com.example.dependecyInjection.service.EmailService;
import com.example.dependecyInjection.service.MessageService;
import com.example.dependecyInjection.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependecyController {

//**********field-based dependency injection*********
@Autowired
MessageService messageService;;
//********constructor-based dependency injection*********
private final EmailService msgsvc;
// @Autowired is not needed
public DependecyController(EmailService emailService) {
    this.msgsvc = emailService;
    System.out.println("Inside Constructor.");
}
//********setter-based dependency injection*******
private TwitterService MytwitterService;
@Autowired
public void setTwitterService(TwitterService twitterService) {
    System.out.println("Inside setService." );
    this. MytwitterService = twitterService;
    }
@RequestMapping("/email") public String emailMessage() {
    return msgsvc.sendMessage("ni", "aaa");
}
@RequestMapping("/twitter") public String twitterMessage() {
    return MytwitterService.sendMessage("hi", "aaa");
}
@RequestMapping("/message") public String message() {
    return messageService.sendMessage("hello","everyone");
}
}
