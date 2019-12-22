package com.springworks.didemo.controllers;

import com.springworks.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

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
