package com.springworks.didemo.controllers;

import com.service.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_S, constructorInjectedController.sayHello());
    }
}
