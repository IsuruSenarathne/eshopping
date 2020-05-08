package com.bellacore.eshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.bellacore.eshopping.entity")
public class EshoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EshoppingApplication.class, args);
	}

}
