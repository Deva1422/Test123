package com.example.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevApplication {

	public static void main(String[] args) {

		SpringApplication.run(DevApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "nameee", defaultValue = "World!") String nam) {
		return String.format("Hello %s!", nam);
		//added line21Git
	}

}
