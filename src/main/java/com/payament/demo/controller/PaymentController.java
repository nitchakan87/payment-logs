package com.payament.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.payament.demo.constants.Constants;
import com.payament.demo.model.PaymentRequest;
import com.payament.demo.model.PaymentResponse;
import com.payament.demo.service.PaymentService;

@RestController
@RequestMapping("/api")
@Slf4j
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/submit")
    public ResponseEntity<PaymentResponse> submitPayment(@RequestBody PaymentRequest paymentRequest,
            @RequestHeader(value = Constants.CORRELATION_ID, required = false) String correlationId) {

        log.info("Received payment request: {}", paymentRequest);

        // Process the payment
        PaymentResponse paymentResponse = paymentService.processPayment(paymentRequest);

        log.info("Payment response: {}", paymentResponse);

        return ResponseEntity.ok(paymentResponse);
    }
}
