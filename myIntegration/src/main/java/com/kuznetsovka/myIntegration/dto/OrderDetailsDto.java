package com.kuznetsovka.myIntegration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailsDto {
    private String product;
    private Double price;
    private Double amount;
    private Double sum;
}
