package com.yahtzee;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DiceValue {
    // diceToValues() copies the values of each Die into an array of ints
// and returns that array of ints
    static int[] diceToValues(Die[] from) {
        int[] to = new int[from.length];  // needs fixing
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i].getValue();
        }
        return to;         // stub
    }

    // Sum the pips on just those dice that match the selected score value
// Example: Given dice values of { 6, 6, 5, 6, 3 } and the value 6, then
// sumPips should return 18
    static int sumPips(Die[] dice, int value) {
        int[] rolls = diceToValues(dice);

        int num = 0;
        for (int i = 0; i < dice.length; i++) {
            if (rolls[i] == value) num++;
        }

        return num * value;  // stub
    }

    // isTrips() returns true if there are at least three of a kind.
// Examples for arrays of dice values:
// { 1, 1, 5, 1, 6 } --> true
// { 1, 2, 3, 4, 4 } --> false
// { 2, 2, 2, 2, 4 } --> true (at least three of a kind, can be more of a kind)
    static boolean isTrips(Die[] dice) {
        int[] rolls = diceToValues(dice);
        int[] occurences = {0, 0, 0, 0, 0, 0};
        for (int roll : rolls) {
            occurences[roll - 1]++;
            if (occurences[roll - 1] == 3) return true;
        }
        return false;  // stub
    }

    // isQuads() returns true if there are at least four of a kind.
// Examples for arrays of dice values:
// { 1, 1, 5, 1, 6 } --> false
// { 1, 2, 3, 4, 4 } --> false
// { 2, 2, 2, 2, 4 } --> true
// { 3, 3, 3, 3, 3 } --> true (at least four of a kind, can be more of a kind)
    static boolean isQuads(Die[] dice) {
        int[] rolls = diceToValues(dice);
        int value1 = rolls[0], value2 = -1;
        for (int i = 1; i < rolls.length; i++) {
            if (rolls[i] == value1) continue;
            if (rolls[i] == value2) continue;
            if (value2 != -1) return false;
            value2 = rolls[i];
        }
        return true;  // stub
    }

    // isYahtzee() returns true if all five dice have the same value
// Examples for arrays of dice values:
// { 1, 1, 5, 1, 6 } --> false
// { 3, 3, 3, 3, 3 } --> true
    static boolean isYahtzee(Die[] dice) {
        int[] rolls = diceToValues(dice);
        int value = rolls[0];
        for (int i = 1; i < rolls.length; i++) {
            if (rolls[i] != value) return false;
        }
        return true;  // stub
    }

    // isFullHouse() returns true if three dice have a common value and the
// other two dice have a common value. A Yahtzee is also a full house.
// Examples for arrays of dice values:
// { 1, 1, 5, 1, 5 } --> true
// { 3, 3, 3, 4, 2 } --> false
// { 4, 4, 4, 4, 4 } --> true
    static boolean isFullHouse(Die[] dice) {
        int[] rolls = diceToValues(dice);
        int[] occurences = {0, 0, 0, 0, 0, 0};

        for (int roll : rolls) occurences[roll - 1]++;

        boolean three = false, two = false;
        for (int num : occurences) {
            if (num == 5) return true;
            if (num == 3) three = true;
            if (num == 2) two = true;
        }

        return three && two;  // stub
    }

    // Returns the largest number of consecutive ints in a sorted array
// Example: consec({1, 2, 4, 5, 6}) returns 3 because the longest
// consecutive sequence is {4, 5, 6}.
    static int consec(int[] sortedNums) {
        int longestSeq = 0, curSeq = 0;
        for (int i = 1; i < sortedNums.length; i++) {
            int lastRoll = sortedNums[i - 1], curRoll = sortedNums[i];
            if (curRoll == lastRoll + 1) {
                curSeq++;
                if (curSeq > longestSeq) longestSeq = curSeq;
            } else if (curRoll != lastRoll) {
                curSeq = 0;
            }
        }
        return longestSeq + 1;  // stub
    }

    // isLargeStraight() returns true if, when sorted, the dice values are
// consecutive integers
// Examples for arrays of dice values:
// { 1, 2, 3, 4, 5 } --> true
// { 2, 3, 4, 5, 6 } --> true
// Anything else --> false
    static boolean isLargeStraight(Die[] dice) {
        int[] sortedRolls = diceToValues(dice);
        Arrays.sort(sortedRolls);
        for (int i = 1; i < sortedRolls.length; i++) {
            int lastRoll = sortedRolls[i - 1], curRoll = sortedRolls[i];
            if (curRoll != lastRoll + 1) return false;
        }
        return true;  // stub
    }

    // isSmallStraight() returns true if you can find four dice that
// have consecutive values. TEST isSmallStraight CAREFULLY.
// Examples for arrays of dice values:
// { 1, 2, 3, 4, 4 } --> true
// { 1, 2, 3, 5, 6 } --> false
// { 1, 3, 4, 5, 6 } --> true
// { 2, 3, 4, 4, 5 } --> true
// { 1, 2, 2, 3, 3 } --> false
    public static boolean isSmallStraight(Die[] dice) {
        int[] sortedRolls = diceToValues(dice);
        Arrays.sort(sortedRolls);
        boolean nonconsec = false;
        for (int i = 1; i < sortedRolls.length; i++) {
            int lastRoll = sortedRolls[i - 1], curRoll = sortedRolls[i];
            if (curRoll != lastRoll + 1) {
                if (nonconsec) return false;
                if (curRoll != lastRoll && i != 1 && i != sortedRolls.length - 1) return false;
                nonconsec = true;
            }
        }
        return true;
    }

    // chance() returns the sum of the dice values
// Examples for arrays of dice values:
// { 1, 2, 3, 4, 4 } --> 14
// { 1, 2, 3, 5, 6 } --> 17
    static int chance(Die[] dice) {
        int[] rolls = diceToValues(dice);

        int sum = 0;
        for (int roll : rolls) sum += roll;

        return sum;  // stub
    }

}
