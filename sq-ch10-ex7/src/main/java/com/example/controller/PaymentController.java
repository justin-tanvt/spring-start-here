package com.example.controller;

import com.example.service.PaymentService;
import com.example.domain.PaymentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePaymentUsingRandom() {
        PaymentDetails paymentDetails = paymentService.processPayment();
        logger.info("Received payment : [" + paymentDetails.getAmount() + "]");

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }

    @PostMapping("/payment-with-body")
    public ResponseEntity<PaymentDetails> makePaymentUsingRequestBody(@RequestBody PaymentDetails paymentDetails) {
        logger.info("Received payment : [" + paymentDetails.getAmount() + "]");

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(paymentDetails);
    }

}
