package com.main;

import com.comparable.*;
import com.mobile.Branch;
import com.mobile.Mobile;
import com.mobile.Weight;
import com.utils.Utils;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    animalCompare();
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
    System.out.println(Utils.arrayToString(animals, ", "));
    for (Animal a : animals) {
      a.eat(200);
    }
    Arrays.sort(animals);
    System.out.println(Utils.arrayToString(animals, ", "));
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
    System.out.println(Utils.arrayToString(cows, ", "));
    Arrays.sort(cows);
    System.out.println(Utils.arrayToString(cows, ", "));
  }

  public static void mobile() {
    Mobile mobile = new Mobile(
            new Branch(5, new Mobile(
                    new Branch(5, new Weight(4)),
                    new Branch(5, new Weight(5))
            )),
            new Branch(5, new Weight(5))
    );
    System.out.println(mobile.totalWeight());
  }

}
