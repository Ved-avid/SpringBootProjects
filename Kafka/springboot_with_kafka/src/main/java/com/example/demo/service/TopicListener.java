package com.example.demo.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TopicListener {
	
	@KafkaListener(topics="hello-world",groupId="group_id")
	public void consume(ConsumerRecord<String,String> payload) {
		System.out.println("Payload:"+payload);
		System.out.println("Topic: "+payload.topic());
		System.out.println("Key: "+payload.key());
		System.out.println("Value: "+payload.value());
		System.out.println("Topic: "+payload.partition());
	}

}


// To start Zookeeper
// ./bin/zookeeper-server-start.sh ./config/zookeeper.properties


// To start Kafka
// ./bin/kafka-server-start.sh ./config/server.properties


// To Start consumer
// ./bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic hello-world --from-beginning
