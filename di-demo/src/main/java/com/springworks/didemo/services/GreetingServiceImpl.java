package com.springworks.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_S = "Hello Sankar!! - Original";

    @Override
    public String sayGreeting(){
        return HELLO_S;
    }

}
