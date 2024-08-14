package com.projetkafka.demo.producer;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
private final org.springframework.kafka.core.KafkaTemplate<String,String> KafkaTemplate;
public void sendMessage(String msg){
    log.info(String.format("Sending message to topic :: %s", msg));
    KafkaTemplate.send("topic",msg);
}
}
