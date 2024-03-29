package com.example.service;

import com.example.domain.PaymentDetails;
import com.example.exception.NotEnoughMoneyException;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PaymentService {

    private Random rd;

    public PaymentService () {
        this.rd = new Random();
    }

    public PaymentDetails processPayment() {
        if (rd.nextDouble() > 0.5) {
            throw new NotEnoughMoneyException();
        }

        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setAmount(rd.nextInt(10000));
        return paymentDetails;
    }
}
