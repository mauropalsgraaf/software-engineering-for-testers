package com.training.factory;

public class WebDialog extends Dialog {
    Button createButton() {
        return new WebButton();
    }
}
