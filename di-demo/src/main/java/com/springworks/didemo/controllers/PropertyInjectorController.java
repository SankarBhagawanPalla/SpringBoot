package com.springworks.didemo.controllers;

import com.springworks.didemo.services.GreetingService;
import com.springworks.didemo.services.GreetingServiceImpl;

public class PropertyInjectorController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
