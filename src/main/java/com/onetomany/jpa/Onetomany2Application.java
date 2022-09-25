package com.onetomany.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.onetomany.*")
@EntityScan("com.onetomany.*")
public class Onetomany2Application {
	public static void main(String[] args) {

        SpringApplication.run(Onetomany2Application.class, args);
    }

}