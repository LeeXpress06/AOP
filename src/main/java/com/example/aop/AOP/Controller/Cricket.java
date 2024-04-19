package com.example.aop.AOP.Controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cricket implements Sport{
    @Override
    public String sound() {

        return "Bat and ball Cricket";
    }
}
