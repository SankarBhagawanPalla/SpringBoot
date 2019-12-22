package com.springworks.didemo.controllers;

import com.springworks.didemo.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;
    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    String sayHello(){
        return greetingService.sayGreeting();
    }


}
