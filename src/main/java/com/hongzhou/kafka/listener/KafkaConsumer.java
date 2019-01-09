package com.hongzhou.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.hongzhou.kafka.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "Kafka_User", groupId = "group_id")
	public void consume(String message) {
		System.out.println("consumeed message: " + message);
	}
	
	@KafkaListener(topics = "Kafka_User_Json", groupId = "group_json")
	public void consumeJson(User user) {
		System.out.println("consumed JSON Message: " + user);
	}
}
