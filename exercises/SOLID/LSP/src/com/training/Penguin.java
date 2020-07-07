package com.training;

public class Penguin implements Bird {

    @Override
    public void walk() {
        System.out.println("Penguin is walking");
    }

    @Override
    public void fly() {
        throw new RuntimeException("Penguins can't fly!");
    }
}
