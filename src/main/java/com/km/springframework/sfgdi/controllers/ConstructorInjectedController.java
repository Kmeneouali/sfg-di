package com.km.springframework.sfgdi.controllers;

import com.km.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

    GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
