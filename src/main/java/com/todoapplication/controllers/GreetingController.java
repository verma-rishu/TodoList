package com.todoapplication.controllers;

import com.todoapplication.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class GreetingController {
    private static final String TEMPLATE = "Hello, %s";
    @GetMapping("/greeting")
    public Greeting getGreeting(@RequestParam(name = "person-name", defaultValue = "Hello World!!") final String name){
        return new Greeting(UUID.randomUUID(),String.format(TEMPLATE,name));
    }

}
