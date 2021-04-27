package com.histogram;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Histogram hist = new Histogram();
        hist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hist.setVisible(true);
    }
}
