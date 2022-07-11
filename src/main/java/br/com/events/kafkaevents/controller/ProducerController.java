package br.com.events.kafkaevents.controller;

import br.com.events.kafkaevents.producer.KafkaProducer;
import br.com.events.kafkaevents.request.TccDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish")
public class ProducerController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping
    public void postMessage(@RequestBody TccDto tccDto) {
        this.kafkaProducer.publishMessage(tccDto.getMsg());
    }
}
