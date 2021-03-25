package com.sorting;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

  static final String RESET = "\u001b[0m";
  static final String BLUE = "\u001b[0;34m";
  static final String GREEN = "\u001b[0;32m";
  static final String BOLD_RED = "\u001b[1;31m";

  public static void main(String[] args) {
    testSort("Bubble Sort", Sort::bubble);
    testSort("Selection Sort", Sort::selection);
    testSort("Insertion Sort", Sort::insertion);
    testSort("Heap Sort", Sort::heap);
    testSort("Merge Sort", Merge::sort);
  }

  public static void testSort(String name, Consumer<Integer[]> sortFunc) {
    Integer[] arr = {5, 12, 18, 7, 19, 17};
    Integer[] sortedArr = {5, 7, 12, 17, 18, 19};
    testSort(name, sortFunc, arr, sortedArr);
  }

  public static void testSort(String name, Consumer<Integer[]> sortFunc, Integer[] arr, Integer[] sortedArr) {
    sortFunc.accept(arr);
    boolean sorted = Arrays.equals(arr, sortedArr);
    System.out.println(BLUE + name + RESET + " - " +
            (sorted ? GREEN : BOLD_RED) + Arrays.toString(arr) + RESET);
  }

}
