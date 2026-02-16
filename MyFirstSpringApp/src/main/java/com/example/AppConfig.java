package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration

@ComponentScan("com.example")
public class AppConfig {
    @Bean("Movie1")//object creation in springboot
    public Movie getMovie1(){
        return new Movie();
    }
    @Bean("Movie2")
    public Movie getMovie2(){
        return new Movie();
    }
    @Bean("Car1")
    public Car getCar(){
        return new Car();
    }
}
