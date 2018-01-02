package com.springboot.springboot.Service;


import com.springboot.springboot.model.Person;
import jdk.nashorn.internal.codegen.CompilerConstants;
import org.apache.kafka.clients.producer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaOperations;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaOperations.ProducerCallback;

import org.springframework.util.concurrent.ListenableFuture;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import java.util.ArrayList;

/**
 * Created by chaitanyaprashar on 31/12/2017.
 */

import java.util.List;

import static javafx.scene.input.KeyCode.T;

@Service
public class PersonService {

    public static List<Person> personlist = new ArrayList<>();

    public PersonService()
    {
        Person person = new Person("11", "Chaitanya", "Prashar", 30);
        personlist.add(person);
    }

    public List<Person> getDetail() {
        return personlist;
    }

    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplate;
    private DefaultKafkaProducerFactory<String, Person> kafkaDefault;

    @Value("${kafka.topic}")
    String kafkaTopic = "babelTopic";

    public void send(Person person) {
        System.out.println("sending data=" + person);
        kafkaTemplate.send(new ProducerRecord<String, Person>(kafkaTopic,person));

    /*  kafkaDefault.createProducer().send(new ProducerRecord<String, Person>(kafkaTopic, person), new Callback() {
          @Override
          public void onCompletion(RecordMetadata recordMetadata, Exception e) {
              System.out.println(recordMetadata);
          }
      });

      */
    }

}