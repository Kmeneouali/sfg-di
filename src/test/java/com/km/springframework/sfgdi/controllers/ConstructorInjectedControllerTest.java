package com.km.springframework.sfgdi.controllers;

import com.km.springframework.sfgdi.services.GreetingService;
import com.km.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller=new ConstructorInjectedController(new GreetingServiceImpl());


    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting() +" From ConstructorInjectedController");
    }
}