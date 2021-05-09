package com.yahtzee;

public class Main {

    private static final Die[] dice = new Die[5];

    public static void main(String[] args) {

        int[] values;

        values = new int[]{1, 2, 3, 5, 6};
        setDice(values);
        System.out.println(DiceValue.consec(values));

    }

    public static void setDice(int[] values) {
        for (int i = 0; i < values.length; i++) {
            Die die = new Die();
            die.setValue(values[i]);
            dice[i] = die;
        }
    }
}
