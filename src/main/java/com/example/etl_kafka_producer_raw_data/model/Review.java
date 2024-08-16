package com.example.etl_kafka_producer_raw_data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Review {
    private int rating;
    private String comment;
    private String date;
    private String reviewerName;
    private String reviewerEmail;

}