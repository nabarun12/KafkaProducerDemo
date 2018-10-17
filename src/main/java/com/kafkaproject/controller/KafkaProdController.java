package com.kafkaproject.controller;

import java.util.Properties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafkaproject.model.Person;

@RestController
@RequestMapping(value="/kafkaproducer")
public class KafkaProdController {
	
	@Autowired
	KafkaTemplate<String,Person> kafka;
	
	
	
	@GetMapping(value = "/produce/{name}/{age}")
	public void produceMessage(@PathVariable("name") String name,@PathVariable("age") int age){
		
		Person personIn = new Person(name, age);
		kafka.send("test", personIn);
		
	}
}