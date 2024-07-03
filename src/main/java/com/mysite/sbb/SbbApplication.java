package com.mysite.sbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbbApplication.class, args);
	}

	@GetMapping("/")
	public String root() {
		return String.format("Hello!! Spring Boot");
	}

}