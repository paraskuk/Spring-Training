package org.example;

import org.example.config.ApplicationConfig;
import org.example.service.OutputService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "org.example.service")
public class Application {

    public static void main(String[] args) throws BeansException, InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);

        for (int i = 0; i < 5; i++) {
            outputService.generateOutput("Frank");
            Thread.sleep(5000);
        }
    }
}
