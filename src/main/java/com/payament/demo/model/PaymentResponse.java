package com.payament.demo.model;

import lombok.Data;

@Data
public class PaymentResponse {
    private String status;
    private String message;
    private String transactionId;
}
