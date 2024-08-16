package com.example.etl_kafka_producer_raw_data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Meta {
    private String createdAt;
    private String updatedAt;
    private String barcode;
    private String qrCode;

}
