package com.training.factory;

public class WindowsDialog extends Dialog {
    Button createButton() {
        return new WindowsButton();
    }
}
