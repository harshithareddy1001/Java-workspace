package com.example.dependencyInjection;

import org.springframework.stereotype.Component;


@Component("Hitachi")

public class Hitachi implements Harddisk{
    @Override
    public String getType() {

        return "Hitachi";
    }
}
