package com.training.adapter;

public class CreditcardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println(
            String.format("Paying %f with creditcard", amount)
        );
    }
}
