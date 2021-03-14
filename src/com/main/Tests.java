package com.main;

import com.utils.ArrayUtils;

import java.util.Arrays;

public class Tests {
  public static void main(String[] args) {
    Integer[] arr = {4, 2, 2, 5, 3, 7, 1};
    ArrayUtils.swap(arr, 1, 3);
    System.out.println(Arrays.toString(arr));
  }
}