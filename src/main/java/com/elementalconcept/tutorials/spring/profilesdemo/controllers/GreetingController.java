package com.elementalconcept.tutorials.spring.profilesdemo.controllers;

import com.elementalconcept.tutorials.spring.profilesdemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private GreetingService greetingService;

    GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
