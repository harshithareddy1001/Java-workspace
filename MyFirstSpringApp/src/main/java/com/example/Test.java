package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        //Movie m=new Movie():-->normal way of creating object
        Movie m1=context.getBean("Movie1", Movie.class);
        m1.setTitle("Troy");
        System.out.println(m1.getTitle());
        Movie m2=context.getBean("Movie2", Movie.class);
        m2.setTitle("Titanic");
        System.out.println(m2.getTitle());
        Car c=context.getBean("Car1",Car.class);
        c.setBrand("benz");
        System.out.println(c.getBrand());
        Book b1=context.getBean(Book.class);//if we do in this way only 1 object will be created
    }
}
