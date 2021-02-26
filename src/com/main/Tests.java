package com.main;

import com.utils.ArrayUtils;

import java.util.Arrays;

public class Tests {
  public static void main(String[] args) {
    Integer[] arr = {12, 18, 7, 19, 17};
    System.out.println(Arrays.toString(arr));
    ArrayUtils.rotate(arr, 2, 4);
    System.out.println(Arrays.toString(arr));
  }
}
