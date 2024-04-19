package com.example.aop.AOP.Controller;

import org.springframework.stereotype.Component;

@Component
public class Football implements Sport{
    @Override
    public String sound() {

        return "Goal football";

    }
}
