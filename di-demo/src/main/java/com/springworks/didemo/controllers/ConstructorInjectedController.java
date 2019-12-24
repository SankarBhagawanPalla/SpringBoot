package com.springworks.didemo.controllers;

import com.service.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {

    private GreetingService greetingService;
    public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }


}
