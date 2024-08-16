package com.example.etl_kafka_producer_raw_data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dimensions {
    private double width;
    private double height;
    private double depth;

}