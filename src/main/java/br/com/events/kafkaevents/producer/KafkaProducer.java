package br.com.events.kafkaevents.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static br.com.events.kafkaevents.constants.ConstantsUtils.TCC_TOPIC;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishMessage(String msg) {
        this.kafkaTemplate.send(TCC_TOPIC, msg);
    }
}
