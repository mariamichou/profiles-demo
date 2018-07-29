package com.elementalconcept.tutorials.spring.profilesdemo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("eng")
public class GreetingServiceImpl implements GreetingService {

    @Value("${greeting.message}")
    private String greetingMessage;

    @Override
    public String sayGreeting() {
        return greetingMessage;
    }
}
