package com.main;

import com.utils.ArrayUtils;
import com.utils.Input;
import com.utils.MathUtils;
import com.utils.MiscUtils;

import java.util.List;

public class BrilliantNumbers {

  public static void run() {
    Input.runOnInt(num -> {
      List<Integer> primeFactors = MathUtils.primeFactorize(num);
      System.out.println("Prime Factors: " + ArrayUtils.arrayToString(primeFactors, ", "));
      System.out.println("Is " + num + " brilliant?");
      if (primeFactors.size() > 2) {
        System.out.println("\u001b[0;31mNo way! Too many prime factors!\u001b[0m");
      } else if (num <= 1) {
        System.out.println("\u001b[0;31mNo way! Not enough prime factors!\u001b[0m");
      } else if (primeFactors.size() == 1) {
        System.out.println("\u001b[0;31mNo way! " + num + " is prime!\u001b[0m");
      } else if (MiscUtils.numLength(primeFactors.get(0)).equals(MiscUtils.numLength(primeFactors.get(1)))) {
        System.out.println("\u001b[0;32mYes! You better believe it!\u001b[0m");
      } else {
        System.out.println("\u001b[0;31mNo way! " + primeFactors.get(0) + " and " + primeFactors.get(1) + " aren't the same length!\u001b[0m");
      }
    });
  }

}
