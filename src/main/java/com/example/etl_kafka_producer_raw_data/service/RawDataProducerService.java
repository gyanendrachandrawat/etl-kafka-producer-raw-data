package com.example.etl_kafka_producer_raw_data.service;

import com.example.etl_kafka_producer_raw_data.model.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RawDataProducerService {

    @Value(value = "${kafka.topic}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void getRawData(ProductRequest productRequest) {
        sendMessage(productRequest);
    }

    private void sendMessage(ProductRequest productRequest) {
        kafkaTemplate.send(topic, productRequest.toString());
    }
}
