package com.comparable;

import com.utils.ArrayUtils;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    animalCompare();
  }

  public static void cowCompare() {
    Cow1[] cows = {
            new Cow1(2000, "Hulk"),
            new Cow1(),
            new Cow1(1600, "Marty"),
            new Cow1(1700, "Moohead"),
            new Cow1(),
            new Cow1(1900, "Mr. Fred")
    };
    System.out.println(ArrayUtils.arrayToString(cows, ", "));
    Arrays.sort(cows);
    System.out.println(ArrayUtils.arrayToString(cows, ", "));
  }

  public static void animalCompare() {
    Animal[] animals = {
            new Horse(2000, "Hulk"),
            new Wombat(),
            new Wombat(1600, "Marty"),
            new Cow2(1700, "Moohead"),
            new Wombat(),
            new Wildebeest(1900, "Mr. Fred")
    };
    System.out.println(ArrayUtils.arrayToString(animals, ", "));
    for (Animal a : animals) {
      a.eat(200);
    }
    Arrays.sort(animals);
    System.out.println(ArrayUtils.arrayToString(animals, ", "));
  }
}
