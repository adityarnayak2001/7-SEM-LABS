package com.example.dependecyInjection.service;
import org.springframework.stereotype.Service;
 @Service
public class EmailService implements MessageService{
     @Override
     public String sendMessage(String msg, String rec){
         System.out.println("Email sent to "+rec+" with Message="+msg);
         return "Email Sent yo "+rec+" with Message="+msg;
     }
}