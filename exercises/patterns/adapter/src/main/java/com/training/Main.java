package com.training;

public class Main {
    public static void main(String[] args) {
        // Make sure the doPayments method can be called with either Paypal or CreditcardPayment
        // Hint: Use the adapter pattern for the paypal class.
        var paymentMethod = new CreditcardPayment();

        doPayment(paymentMethod, 100);
    }

    public static void doPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);

        System.out.println("Successfully did payment!");
    }
}
