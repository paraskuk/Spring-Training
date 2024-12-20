package org.example.config;
import org.example.service.GreetingService;
import org.example.service.OutputService;
import org.example.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "org.example")
public class ApplicationConfig {

// Remove this as we dont need it anymore
//
//    @Value("${app.greeting}")
//    private String greeting;
//    @Value("${app.name}")
//    private String name;
//    @Value("#{new Boolean(environment['spring.profiles.active']!='dev')}") //this is SPEL - Spring Expression Language
//    private boolean is24;
//
//    @Autowired
//    private GreetingService greetingService;
//    @Autowired
//    private TimeService timeService;
//
//    @Bean
//    @Profile("!dev")
//    public TimeService timeService(){
//        return new TimeService();
//    }
//
//    @Bean
//    @Profile("dev")
//    public TimeService timeService12(){
//        return new TimeService();
//    }
//
//
//    @Bean
//    public OutputService outputService(){
//        return new OutputService(greetingService, timeService);
//    }
//
//    @Bean
//    public GreetingService greetingService(){
//        return new GreetingService();
//    }

}
