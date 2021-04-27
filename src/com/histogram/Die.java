package com.histogram;

public class Die {
    private int sides;  // number of sides of die
    private int value;  // current value that the die is showing

    public Die(int sides) {
        this.sides = sides;
    }

    public int roll() {
        value = (int) (Math.random() * sides); // YOUR CODE HERE
        return value;
    }

    public int getValue() {
        return value;
    }
}