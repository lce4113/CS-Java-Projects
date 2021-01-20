package com.utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {

  public static <T> List<T> unshift(List<T> arr, T newElement) {
    List<T> newArr = new ArrayList<>();
    newArr.add(newElement);
    newArr.addAll(arr);
    return newArr;
  }

  public static <T> String arrayToString(List<T> arr, String delimiter) {
    StringBuilder str = new StringBuilder();
    str.append(arr.get(0));
    for (int i = 1; i < arr.size(); i++) {
      str.append(delimiter);
      str.append(arr.get(i));
    }
    return str.toString();
  }

  public static <T> String arrayToString(T[] arr, String delimiter) {
    StringBuilder str = new StringBuilder();
    str.append(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      str.append(delimiter);
      str.append(arr[i]);
    }
    return str.toString();
  }

  public static Integer numLength(int num) {
    return Integer.toString(num).length();
  }

  public static Integer numLength(double num) {
    return Double.toString(num).length() - 1;
  }

  public static Integer numLength(float num) {
    return Float.toString(num).length() - 1;
  }

}
