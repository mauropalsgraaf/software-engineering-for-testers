package com.training.factory;

public class WebButton implements Button {
    public void render() {
        System.out.println("I'm a web button");
    }
    public void onClick() {
        System.out.println("You just clicked a web button");
    }
}

