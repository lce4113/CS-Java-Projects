package com.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {

  public static int[] slice(int[] arr, int low, int high) {
    int[] newArr = new int[high - low];
    for (int i = low; i < high; i++) {
      newArr[i - low] = arr[i];
    }
    return newArr;
  }

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

  public static <T> void swap(List<T> arr, int a, int b) {
    T temp = arr.get(a);
    arr.set(a, arr.get(b));
    arr.set(b, temp);
  }

  public static <T> void swap(T[] arr, int a, int b) {
    T temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public static <T> void rotate(List<T> arr, int low, int high) {
    T temp = arr.get(high);
    for (int i = high; i > low; i--) {
      arr.set(i, arr.get(i - 1));
    }
    arr.set(low, temp);
  }

  public static <T> void rotate(T[] arr, int low, int high) {
    T temp = arr[high];
    for (int i = high; i > low; i--) {
      arr[i] = arr[i - 1];
    }
    arr[low] = temp;
  }

  public static <T extends Comparable> int min(List<T> arr) {
    int min = 0;
    for (int i = 1; i < arr.size(); i++) {
      if (arr.get(i).compareTo(arr.get(min)) < 0) {
        min = i;
      }
    }
    return min;
  }

  public static <T extends Comparable> int min(T[] arr) {
    int min = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i].compareTo(arr[min]) < 0) {
        min = i;
      }
    }
    return min;
  }

  public static <T extends Comparable> int min(List<T> arr, int lowerBound) {
    int m = lowerBound;
    for (int i = lowerBound + 1; i < arr.size(); i++) {
      if (arr.get(i).compareTo(arr.get(m)) < 0) {
        m = i;
      }
    }
    return m;
  }

  public static <T extends Comparable> int min(T[] arr, int lowerBound) {
    int m = lowerBound;
    for (int i = lowerBound + 1; i < arr.length; i++) {
      if (arr[i].compareTo(arr[m]) < 0) {
        m = i;
      }
    }
    return m;
  }

  public static Integer sum(Integer[] arr) {
    int sum = 0;
    for (Integer el : arr) {
      sum += el;
    }
    return sum;
  }

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

}
