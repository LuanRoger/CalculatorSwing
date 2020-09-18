package com.luanroger.calculator;

public class AddNumber {
    public String Add(int toAdd, javax.swing.JTextField txtToRecive) {
        String reciveText = txtToRecive.getText() + toAdd;
        return reciveText;
    }
}
