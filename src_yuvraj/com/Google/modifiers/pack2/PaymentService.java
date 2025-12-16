package com.Google.modifiers.pack2;

public class PaymentService {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.doPayment();  // template method pattern
    }
}