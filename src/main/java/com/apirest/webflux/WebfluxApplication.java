package com.apirest.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class WebfluxApplication {

	public static void main(String[] args) {

		SpringApplication.run(WebfluxApplication.class, args);
		System.out.print("Hello world!!!");
	}

}
