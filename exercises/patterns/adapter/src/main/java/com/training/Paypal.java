package com.training;

import java.math.BigDecimal;

public class Paypal {
    boolean sendTransaction(BigDecimal amount) throws UnableToTransactException {
        System.out.println("Sending a paypal transaction!");

        return true;
    }
}
