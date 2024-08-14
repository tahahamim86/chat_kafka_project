package com.projetkafka.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import com.projetkafka.demo.payload.Student;

@Service
@Slf4j
public class KafkaConsumer {

   // @KafkaListener(topics = "chat-messages", groupId = "myGroup")
   // public void consumeMsg(String msg) {log.info(String.format("Consuming the message from Topic:: %s", msg));}
    @KafkaListener(topics = "chat-messages", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(String.format("Consuming the message from Topic:: %s", student.toString()));
    }
}
