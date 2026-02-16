package com.example.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HP implements Laptop{
    @Autowired
    @Qualifier("Hitachi")//component name
    Harddisk hd;//bean is just declared but not created so we use autowired
    @Override
    public void spec(){
        System.out.println(hd.getType());
    }
}
