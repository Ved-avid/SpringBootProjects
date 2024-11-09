package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.KafkaSender;

@SpringBootApplication
@RestController
public class SpringbootWithKafkaApplication {
	
	@Autowired
	KafkaSender sender;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithKafkaApplication.class, args);
	}
	
	
	@GetMapping("/producer")
	public String producer(@RequestParam("message") String message) {
		sender.send(message);
		return "message sent";
	}
	
	

}
