package com.marcofontana.foodlymaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan
@ComponentScan(basePackages = "com.marcofontana.foodlymaven")
public class FoodlyMavenApplication {
	public static void main(String[] args) {
		SpringApplication.run(FoodlyMavenApplication.class, args);
	}

}
