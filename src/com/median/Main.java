package com.median;

import static com.median.Median.median;

public class Main {
  public static void main(String[] args) {
    Integer[] a = {4, 2, 2, 5, 3, 7, 1};
    Integer[] b = {3, 8, 4, 1, 7, 2, 5, 6, 9, 10};
    Integer[] c = {3};
    // This should print 5.0
    median(a);
    // This should print 5.5
    median(b);
    // This should print 3.0
    median(c);
  }
}
