package com.Google.modifiers.pack2;

public class UpiPayment extends Payment {
    protected void validateRequest() {
        System.out.println("Validate VPA & OTP");
    }

    protected void processPayment() {
        System.out.println("UPI gateway processing...");
    }
}