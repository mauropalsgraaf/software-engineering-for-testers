package com.training.factory;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("I'm a windows button");
    }

    public void onClick() {
        System.out.println("You just clicked a windows button");
    }
}
