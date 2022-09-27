package com.example.TestController.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestController.model.Employee;
import com.example.TestController.model.Gamer;

@RestController
public class TestController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee firstPage() {

        Employee emp = new Employee();
        emp.setName("emp1");
        emp.setDesignation("Developer");
        emp.setEmpId("1");
        emp.setSalary(3000);

        return emp;
    }

    @RequestMapping(value = "/gamer", method = RequestMethod.GET)
    public Gamer secondPage() {

        Gamer gamer = new Gamer();
        gamer.setName("Jason Susanto");
        gamer.setEsportsOrg("Paper Rex");
        gamer.setGamingAlias("f0rsakeN");
        gamer.setNetWorth(67216);
        return gamer;
    }


}