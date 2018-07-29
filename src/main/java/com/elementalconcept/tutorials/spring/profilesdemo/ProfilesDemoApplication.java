package com.elementalconcept.tutorials.spring.profilesdemo;

import com.elementalconcept.tutorials.spring.profilesdemo.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProfilesDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ProfilesDemoApplication.class, args);

        System.out.println(ctx.getBean(GreetingController.class).sayGreeting());

    }
}
