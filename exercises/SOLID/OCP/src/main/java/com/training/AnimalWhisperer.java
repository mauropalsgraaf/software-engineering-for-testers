package com.training;

public class AnimalWhisperer {
    public void whisper(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Woof");
            return;
        }

        if (animal instanceof Cat) {
            System.out.println("Miauw");
        }
    }
}
