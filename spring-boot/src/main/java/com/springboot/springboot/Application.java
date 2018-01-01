package com.springboot.springboot;

import com.springboot.springboot.Service.PersonService;
import com.springboot.springboot.model.Person;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.chrono.ChronoPeriod;
import java.util.Properties;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

		@Autowired
		PersonService producer;

		@Override
		public void run(String... arg0) throws Exception {
			// Send Mary customer
			Person chaitanya = new Person("11", "Chaitanya", "Prashar", 30);
			producer.send(chaitanya);

	}
}
