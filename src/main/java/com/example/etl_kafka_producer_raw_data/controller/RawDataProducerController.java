package com.example.etl_kafka_producer_raw_data.controller;

import com.example.etl_kafka_producer_raw_data.model.ProductRequest;
import com.example.etl_kafka_producer_raw_data.service.RawDataProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/raw-data")
public class RawDataProducerController {

    @Autowired
    RawDataProducerService rawDataProducerService;

    @GetMapping("/productRequest")
    public void getRawData(@RequestBody ProductRequest productRequest) {
        rawDataProducerService.getRawData(productRequest);
    }
}
