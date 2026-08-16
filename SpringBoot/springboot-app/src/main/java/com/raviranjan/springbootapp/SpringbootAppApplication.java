package com.raviranjan.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// mvn spring-boot:run
// mvn clean spring-boot:run
// export DATABASE_PASSWORD='npg_Z7PqTwmDEI6e'
// https://glorious-goldfish-wvqxqv666q39rgx-8080.app.github.dev
// https://glorious-goldfish-wvqxqv666q39rgx-8080.app.github.dev

@SpringBootApplication
public class SpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppApplication.class, args);
		System.out.println("Hello, SpringBoot");
	}

}
