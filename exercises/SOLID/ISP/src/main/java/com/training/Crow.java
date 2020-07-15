package com.training;

public class Crow implements Bird {
    @Override
    public void walk() {
        System.out.println("Crow is walking");
    }

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }
}
