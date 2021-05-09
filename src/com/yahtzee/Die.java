package com.yahtzee;

public class Die {
    private int value;
    private int sides;
    private boolean frozen;

    public Die() {
        this(6);  // default to six sides
    }

    public Die(int sides) {
        this.sides = sides;
        frozen = false;
    }

    public int roll() {
        //value = 3;  // for testing purposes when we need to verify that extra yahtzees work
        if (!frozen) {
            value = (int) (sides * Math.random()) + 1;
        }
        return value;
    }

    public void toggle() {
        frozen = !frozen;
    }

    public void unfreeze() {
        frozen = false;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int n) {
        value = n;
    }

    public int getSides() {
        return sides;
    }

    public String toString() {
        return "" + value;
    }
}