package com.security.inmemory.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
	@GetMapping("/test")
	public String test(){
		return "Test API is working";
	}
	@GetMapping("/user")
	public String userTest(){
		return "User API is working";
	}
	@GetMapping("/home")
	public String home(){
		return "Home API is working";
	}

	@GetMapping("/admin")
	public String adminTest(){
		return "Admin API works";
	}

}
