package com.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Array utils.
 */
public class ArrayUtils {


  /**
   * Copy an array onto another
   *
   * @param arr1 The array to copy onto
   * @param arr2 The array to copy from
   */
  public static <T> void copyTo(T[] arr1, T[] arr2) {
    for (int i = 0; i < arr2.length; i++) {
      arr1[i] = arr2[i];
    }
  }

  /**
   * Returns a section of an array
   *
   * @param arr  The array
   * @param low  The lower limit (inclusive)
   * @param high The upper limit (non-inclusive)
   * @return The section of the array
   */
  public static Integer[] slice(Integer[] arr, int low, int high) {
    Integer[] newArr = new Integer[high - low];
    for (int i = low; i < high; i++) {
      newArr[i - low] = arr[i];
    }
    return newArr;
  }

  /**
   * Insert int [ ].
   *
   * @param arr the arr
   * @param el  the el
   * @param pos the pos
   * @return the int [ ]
   */
  public static int[] insert(int[] arr, int el, int pos) {
    int[] newArr = new int[arr.length + 1];
    for (int i = 0; i < pos; i++) {
      newArr[i] = arr[i];
    }
    newArr[pos] = el;
    for (int i = pos; i < arr.length; i++) {
      newArr[i + 1] = arr[i];
    }
    return newArr;
  }

  /**
   * Swap.
   *
   * @param <T> the type parameter
   * @param arr the arr
   * @param a   the a
   * @param b   the b
   */
  public static <T> void swap(List<T> arr, int a, int b) {
    T temp = arr.get(a);
    arr.set(a, arr.get(b));
    arr.set(b, temp);
  }

  /**
   * Swap.
   *
   * @param <T> the type parameter
   * @param arr the arr
   * @param a   the a
   * @param b   the b
   */
  public static <T> void swap(T[] arr, int a, int b) {
    T temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  /**
   * Rotate.
   *
   * @param <T>  the type parameter
   * @param arr  the arr
   * @param low  the low
   * @param high the high
   */
  public static <T> void rotate(List<T> arr, int low, int high) {
    T temp = arr.get(high);
    for (int i = high; i > low; i--) {
      arr.set(i, arr.get(i - 1));
    }
    arr.set(low, temp);
  }

  /**
   * Rotate.
   *
   * @param <T>  the type parameter
   * @param arr  the arr
   * @param low  the low
   * @param high the high
   */
  public static <T> void rotate(T[] arr, int low, int high) {
    T temp = arr[high];
    for (int i = high; i > low; i--) {
      arr[i] = arr[i - 1];
    }
    arr[low] = temp;
  }

  /**
   * Min int.
   *
   * @param <T> the type parameter
   * @param arr the arr
   * @return the int
   */
  public static <T extends Comparable> int min(List<T> arr) {
    int min = 0;
    for (int i = 1; i < arr.size(); i++) {
      if (arr.get(i).compareTo(arr.get(min)) < 0) {
        min = i;
      }
    }
    return min;
  }

  /**
   * Min int.
   *
   * @param <T> the type parameter
   * @param arr the arr
   * @return the int
   */
  public static <T extends Comparable> int min(T[] arr) {
    int min = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i].compareTo(arr[min]) < 0) {
        min = i;
      }
    }
    return min;
  }

  /**
   * Min int.
   *
   * @param <T>        the type parameter
   * @param arr        the arr
   * @param lowerBound the lower bound
   * @return the int
   */
  public static <T extends Comparable> int min(List<T> arr, int lowerBound) {
    int m = lowerBound;
    for (int i = lowerBound + 1; i < arr.size(); i++) {
      if (arr.get(i).compareTo(arr.get(m)) < 0) {
        m = i;
      }
    }
    return m;
  }

  /**
   * Min int.
   *
   * @param <T>        the type parameter
   * @param arr        the arr
   * @param lowerBound the lower bound
   * @return the int
   */
  public static <T extends Comparable> int min(T[] arr, int lowerBound) {
    int m = lowerBound;
    for (int i = lowerBound + 1; i < arr.length; i++) {
      if (arr[i].compareTo(arr[m]) < 0) {
        m = i;
      }
    }
    return m;
  }

  /**
   * Sum integer.
   *
   * @param arr the arr
   * @return the integer
   */
  public static Integer sum(Integer[] arr) {
    int sum = 0;
    for (Integer el : arr) {
      sum += el;
    }
    return sum;
  }

  /**
   * Unshift list.
   *
   * @param <T>        the type parameter
   * @param arr        the arr
   * @param newElement the new element
   * @return the list
   */
  public static <T> List<T> unshift(List<T> arr, T newElement) {
    List<T> newArr = new ArrayList<>();
    newArr.add(newElement);
    newArr.addAll(arr);
    return newArr;
  }

  /**
   * Array to string string.
   *
   * @param <T>       the type parameter
   * @param arr       the arr
   * @param delimiter the delimiter
   * @return the string
   */
  public static <T> String arrayToString(List<T> arr, String delimiter) {
    StringBuilder str = new StringBuilder();
    str.append(arr.get(0));
    for (int i = 1; i < arr.size(); i++) {
      str.append(delimiter);
      str.append(arr.get(i));
    }
    return str.toString();
  }

  /**
   * Array to string string.
   *
   * @param <T>       the type parameter
   * @param arr       the arr
   * @param delimiter the delimiter
   * @return the string
   */
  public static <T> String arrayToString(T[] arr, String delimiter) {
    StringBuilder str = new StringBuilder();
    str.append(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      str.append(delimiter);
      str.append(arr[i]);
    }
    return str.toString();
  }

}
