package com.training.factory;

public abstract class Dialog {
    abstract Button createButton();

    void renderDialog() {
        System.out.println("Rendering dialog");
        System.out.println("Rendering button: ");
        createButton().render();
    }
}
