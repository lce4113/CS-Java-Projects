package com.sorting;

import com.utils.ArrayUtils;

import java.util.List;

public class Sort {

  static <T extends Comparable> void bubble(T[] arr) {
    for (int i = arr.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
          ArrayUtils.swap(arr, j, j + 1);
        }
      }
    }
  }

  static <T extends Comparable> void bubble(List<T> arr) {
    for (int i = arr.size() - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
          ArrayUtils.swap(arr, j, j + 1);
        }
      }
    }
  }

  static <T extends Comparable> void selection(T[] arr) {
    int minPos;
    for (int i = 0; i < arr.length - 1; i++) {
      minPos = ArrayUtils.min(arr, i);
      ArrayUtils.swap(arr, i, minPos);
    }
  }

  static <T extends Comparable> void selection(List<T> arr) {
    int minPos, len = arr.size();
    for (int i = 0; i < len; i++) {
      minPos = ArrayUtils.min(arr, i);
      ArrayUtils.swap(arr, i, minPos);
    }
  }

  static <T extends Comparable> void insertion(T[] arr) {
    for (int i = 2; i < arr.length; i++) {
      int j = i - 1;
      while (j > 0) {
        if (arr[j].compareTo(arr[i]) < 0) break;
        j--;
      }
      ArrayUtils.rotate(arr, j + 1, i);
    }
  }

  static <T extends Comparable> void insertion(List<T> arr) {
    int len = arr.size();
    for (int i = 2; i < len; i++) {
      int j = i - 1;
      while (j > 0) {
        if (arr.get(j).compareTo(arr.get(i)) < 0) break;
        j--;
      }
      ArrayUtils.rotate(arr, j + 1, i);
    }
  }

}