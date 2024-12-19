package org.example.config;
import org.example.service.GreetingService;
import org.example.service.OutputService;
import org.example.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig

{
    @Value("Hello")
    private String greeting;

    @Autowired
    private GreetingService greetingService;

    @Autowired
    private TimeService timeService;

    @Bean
    public GreetingService greetingService() {
        return new GreetingService("Hello");
    }

    @Bean
    public TimeService timeService() {
        return new TimeService(true);
    }

    @Bean
    public OutputService outputService() {
        return new OutputService(greeting,timeService);
    }

}
