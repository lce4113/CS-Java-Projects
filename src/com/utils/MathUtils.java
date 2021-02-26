package com.utils;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {

  public static boolean isPrime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static List<Integer> primeFactorize(int num) {
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (isPrime(i) && num % i == 0) {
        return ArrayUtils.unshift(primeFactorize(num / i), i);
      }
    }
    List<Integer> arr = new ArrayList<>();
    arr.add(num);
    return arr;
  }

}
