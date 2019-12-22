package com.springworks.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
/*This registers a bean with name "myController", same as class name but first letter small*/
public class MyController {

    public void hello(){

        System.out.println("Hello!!");


    }

}
