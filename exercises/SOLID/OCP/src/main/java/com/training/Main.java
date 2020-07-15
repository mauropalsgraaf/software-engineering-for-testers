package com.training;

public class Main {
    public static void main(String[] args) {
        AnimalWhisperer whisperer = new AnimalWhisperer();

        Animal animal = new Cat();
        Animal anotherAnimal = new Dog();

        whisperer.whisper(animal);
        whisperer.whisper(anotherAnimal);
    }
}
