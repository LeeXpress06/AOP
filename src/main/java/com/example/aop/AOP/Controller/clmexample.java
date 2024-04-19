package com.example.aop.AOP.Controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class clmexample implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("command line runner is excuted at the beginning");
    }
}
