package com.main;

import com.utils.ArrayUtils;

public class Tests {
  public static void main(String[] args) {
  System.out.println((int)3.7);
  }

  public static int partition(int[] a, int left, int right) {
    int splitPos = left;
    for (int i = left; i < right; i++) {
      if (a[i] < a[right]) {
        ArrayUtils.swap(a, i, splitPos);
        splitPos++;
      }
    }
    ArrayUtils.swap(a, splitPos, right);
    return splitPos;
  }
}