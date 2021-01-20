package com.bellnumber;

import java.util.ArrayList;
import java.util.List;

public class Pascal {

  public static void main(String[] args) {
    System.out.println(pascalRow(0));
    System.out.println(pascalRow(1));
    System.out.println(pascalRow(2));
    System.out.println(pascalRow(3));
    System.out.println(pascalRow(4));
  }

  // Complete this method
  public static List<Integer> pascalRow(int rowNum) {
    List<Integer> previous = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    previous.add(1);

    // How many rows should we be processing?
    for (int row = 0; row < rowNum; row++) {
      // What is the 0th element of the current row?
      current.add(1);
      // Fill in the current row by using data from the current row
      // and previous row
      for (int column = 0; column < previous.size() - 1; column++) {
        current.add(previous.get(column) + previous.get(column + 1));
      }
      current.add(1);
      // The current row becomes the previous row and
      // the new current row gets initialized
      previous = current;
      current = new ArrayList<>();
    }

    // Return the Bell row ArrayList
    return previous;
  }

  public static int pascalNum(int row, int column) {
    // Return the number from (row, column)
    return pascalRow(row).get(column);
  }

}
