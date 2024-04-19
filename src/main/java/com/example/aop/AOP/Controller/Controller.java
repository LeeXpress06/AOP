package com.example.aop.AOP.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    private Sport sport;

    @Autowired
    public Controller(@Qualifier("football")  Sport sport){
        this.sport = sport;
    }


    @GetMapping("/hello")
    public String hello( ){

        return " Hello Aspect Oriented programming";
    }
    @GetMapping("/sport")
    public String sport( ){

       return sport.sound();

    }




}
