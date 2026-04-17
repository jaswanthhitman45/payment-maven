package com.example;

public class PaymentService {

    public boolean processPayment(double amount, String cardNumber) {
        if (amount <= 0) {
            return false;
        }
        if (cardNumber == null || cardNumber.isEmpty()) {
            return false;
        }
        return true;
    }
}