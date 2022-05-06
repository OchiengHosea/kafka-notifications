package com.duke.kafkanotifications;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "dukenotifications", groupId = "generalNotifications")
    void listener(String data){
        System.out.println("Listener received: " + data + " ...");
    }
}
