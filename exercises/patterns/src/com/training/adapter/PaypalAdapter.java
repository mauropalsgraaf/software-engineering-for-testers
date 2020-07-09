package com.training.adapter;

import java.math.BigDecimal;

public class PaypalAdapter implements PaymentMethod {
    private Paypal adaptee;

    public PaypalAdapter(Paypal paypal) {
        this.adaptee = paypal;
    }

    @Override
    public void pay(double amount) {
        this.adaptee.sendTransaction(BigDecimal.valueOf(amount));
    }
}
