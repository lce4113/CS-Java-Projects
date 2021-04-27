package com.sorting;

import com.utils.ArrayUtils;

public class Merge {

  public static void sort(Integer[] arr) {

    if (arr.length == 1) return;

    int middle = arr.length / 2;
    Integer[] first = ArrayUtils.slice(arr, 0, middle);
    Integer[] second = ArrayUtils.slice(arr, middle, arr.length);
    Integer[] sorted = new Integer[arr.length];
    sort(first);
    sort(second);

    int firstPos = 0, secondPos = 0;
    for (int i = 0; i < arr.length; i++) {
      boolean firstWithin = firstPos >= first.length;
      boolean secondWithin = secondPos >= second.length;
      if (firstWithin) {
        sorted[i] = second[secondPos++];
      } else if (secondWithin || first[firstPos] < second[secondPos]) {
        sorted[i] = first[firstPos++];
      } else {
        sorted[i] = second[secondPos++];
      }
    }

    ArrayUtils.copyTo(arr, sorted);

  }

}
