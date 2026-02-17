package com.example;

import com.example.Model.cricket_lombok;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //this 1 annotation has bundle of these 3 annotations
//@componentScan("com.example) @Configuration @EnableAutoConfiguration
public class DemoAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
		cricket_lombok c=new cricket_lombok();
	}

}
