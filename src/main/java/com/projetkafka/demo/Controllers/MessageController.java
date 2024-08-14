package com.projetkafka.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.projetkafka.demo.producer.KafkaProducer;
import com.projetkafka.demo.producer.KafkaJsonProducer;
import com.projetkafka.demo.payload.Student;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {
    
    //private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

   // @PostMapping("/text")
    //public ResponseEntity<String> sendMessage(@RequestBody String message) {
       // kafkaProducer.sendMessage(message);  // Send the message using KafkaProducer return ResponseEntity.ok("Message queued successfully");  }

    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(@RequestBody Student student) {
        kafkaJsonProducer.sendMessage(student);  // Send the message using KafkaJsonProducer
        return ResponseEntity.ok("JSON message queued successfully");
    }
}
