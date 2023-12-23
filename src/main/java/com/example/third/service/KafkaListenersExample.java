package com.example.third.service;

import com.example.third.dto.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
class KafkaListenersExample {


    @KafkaListener(topics = "demo_topic", groupId = "myGroup")
    void listener(Message data) {

        System.out.println(data);

    }

}