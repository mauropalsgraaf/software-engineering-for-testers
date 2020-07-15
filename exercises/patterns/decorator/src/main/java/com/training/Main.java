package com.training;

public class Main {
    public static void main(String[] args) {
        // Make this example work
        var firstOrder = new Cookie(new Milk(new Sugar(new Espresso())));
        var secondOrder = new Milk(new Coffee());

        System.out.println(firstOrder.cost());
        System.out.println(secondOrder.cost());
    }
}
