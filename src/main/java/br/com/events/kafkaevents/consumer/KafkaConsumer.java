package br.com.events.kafkaevents.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static br.com.events.kafkaevents.constants.ConstantsUtils.GROUP_ID;
import static br.com.events.kafkaevents.constants.ConstantsUtils.TCC_TOPIC;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = TCC_TOPIC, groupId = GROUP_ID)
    public void getMessage(String message) {
        System.out.println(message);
    }
}
