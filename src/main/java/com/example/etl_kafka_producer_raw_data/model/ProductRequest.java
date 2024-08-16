package com.example.etl_kafka_producer_raw_data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductRequest {

    private List<Product> products;
    private int total;
    private int skip;
    private int limit;

}
