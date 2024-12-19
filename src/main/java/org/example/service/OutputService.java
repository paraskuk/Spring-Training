package org.example.service;

import org.springframework.stereotype.Component;

@Component
public class OutputService {
    private final String greeting;
    private final TimeService timeService;

    public OutputService(String greeting, TimeService timeService) {
        this.greeting = greeting;
        this.timeService = timeService;
    }


    public void generateOutput(String name) {
        System.out.println(greeting + ", " + name + "! TimeService is active: " + timeService.isActive());
    }
}