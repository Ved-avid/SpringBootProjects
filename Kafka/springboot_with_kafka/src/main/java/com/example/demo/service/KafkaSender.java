package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
	
	@Autowired
	private KafkaTemplate<String,String> template;
	
	String topic = "hello-world";
	
	public void send(String message) {
		template.send(topic, message);
	}

}
