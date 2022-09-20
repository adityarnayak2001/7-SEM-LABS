package com.example.HelloWorld.controller;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    String home(){
        return "Hello world!";
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World!! from spring boot!!";
    }
    //web service that takes the path variable:
    @GetMapping("/hello1/{name}")
    public String hello1(@PathVariable("name") String name)
    {
        return "Hello " + name;
    }
    //web service that passes parameters through URL:
    @GetMapping("/hello2")

    public String hello2(@RequestParam(name="name", required = false, defaultValue = "CSE") String name)
    {
        return "Hello " + name;
    }
    @RequestMapping("/hello3")
    //@ResponseBody
    public String hello3(@RequestParam(name = "id") String myId, @RequestParam String name) {
        return "ID: " + myId + " Name: " + name;
    }

}

