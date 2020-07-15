package com.training;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Crow();

        Main.doSomething(bird);
    }

    public static void doSomething(Bird bird) {
        System.out.println("Fly my little bird!");
        bird.fly();
    }
}
