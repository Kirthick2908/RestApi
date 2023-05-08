package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Hotel Database",
				version="1.1.2",
				description="Hotel Dish Details",
				contact=@Contact(
						name="Kirthick",
						email="kirthickdeivasigamani@gmail.com"
						)
				)	
		)
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

}
