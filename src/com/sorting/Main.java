package com.sorting;

import com.utils.ArrayUtils;

public class Main {
  public static void main(String[] args) {

    Integer[] arr1 = {5, 12, 18, 7, 19, 17};
    Sort.bubble(arr1);
    System.out.println(ArrayUtils.arrayToString(arr1, ", "));

    Integer[] arr2 = {5, 12, 18, 7, 19, 17};
    Sort.selection(arr2);
    System.out.println(ArrayUtils.arrayToString(arr2, ", "));

    Integer[] arr3 = {5, 12, 18, 7, 19, 17};
    Sort.insertion(arr3);
    System.out.println(ArrayUtils.arrayToString(arr3, ", "));

    Integer[] arr4 = {5, 12, 18, 7, 19, 17};
    Sort.heap(arr4);
    System.out.println(ArrayUtils.arrayToString(arr4, ", "));

  }
}
