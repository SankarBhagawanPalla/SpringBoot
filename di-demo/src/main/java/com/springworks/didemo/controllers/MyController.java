package com.springworks.didemo.controllers;

import com.service.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
/*This registers a bean with name "myController", same as class name but first letter small*/
public class MyController {

    private GreetingService greetingService;
    
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){


        System.out.println("Hello!!");
        return greetingService.sayGreeting();


    }

}
