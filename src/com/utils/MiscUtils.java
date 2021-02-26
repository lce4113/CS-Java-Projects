package com.utils;

public class MiscUtils {

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
