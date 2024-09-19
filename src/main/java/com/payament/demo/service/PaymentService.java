package com.payament.demo.service;


import org.springframework.stereotype.Service;

import com.payament.demo.model.PaymentRequest;
import com.payament.demo.model.PaymentResponse;

import java.util.UUID;

@Service
public class PaymentService {

    public PaymentResponse processPayment(PaymentRequest paymentRequest) {
        // Process the payment (mocked logic here)
        PaymentResponse response = new PaymentResponse();
        response.setStatus("SUCCESS");
        response.setMessage("Payment processed successfully.");
        response.setTransactionId(UUID.randomUUID().toString());
        
        return response;
    }
}
