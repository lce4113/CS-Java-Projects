package com.median;

import com.utils.ArrayUtils;

import java.util.Arrays;

public class Median {

  // quickSort is now renamed to median
  public static void median(Integer[] a) {
    System.out.println(
            "The median of \u001b[0;34m"
                    + Arrays.toString(a) + "\u001b[0m is: \u001b[0;35m"
                    + quick(a, 0, a.length) + "\u001b[0m"
    );
  }

  // You modify the quick method
  public static double quick(Integer[] arr, int low, int high) {
    int pivot = low;
    for (int i = low + 1; i < high; i++) {
      if (arr[i] < arr[pivot]) {
        ArrayUtils.rotate(arr, pivot, i);
        pivot++;
      }
    }
    if (arr.length % 2 == 0) {
      if (pivot == arr.length / 2 - 1) {
        int min = pivot + 1;
        for (int i = pivot + 2; i < high; i++) {
          if (arr[i].compareTo(arr[min]) < 0) min = i;
        }
        return ((double) arr[pivot] + (double) arr[min]) / 2;
      }
      if (pivot == arr.length / 2) {
        int max = 0;
        for (int i = 1; i < pivot; i++) {
          if (arr[i].compareTo(arr[max]) > 0) max = i;
        }
        return ((double) arr[pivot] + (double) arr[max]) / 2;
      }
      if (pivot < arr.length / 2) return quick(arr, pivot + 1, high);
    } else {
      if (pivot == (arr.length - 1) / 2) return arr[pivot];
      if (pivot < (arr.length - 1) / 2) return quick(arr, pivot + 1, high);
    }
    return quick(arr, low, pivot);
  }

}
