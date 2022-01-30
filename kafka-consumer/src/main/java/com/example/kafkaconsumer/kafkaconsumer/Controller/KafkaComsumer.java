package com.example.kafkaconsumer.kafkaconsumer.Controller;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaComsumer {

    @KafkaListener(topics="demotopic", groupId ="group_id")
    public void consume(String message){
    System.out.println(message);
    }
}
