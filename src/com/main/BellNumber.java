package com.main;

import java.util.ArrayList;
import java.util.List;

public class BellNumber {

  public static void main(String[] args) {
    System.out.println(bellRow(3));   // Should print [5, 7, 10, 15]
    System.out.println(bellNum(3, 0)); // Should print 5
    System.out.println(bellNum(3, 2)); // Should print 10
    System.out.println(bellRow(0));    // prints [1]
    System.out.println(bellRow(3));    // prints [5, 7, 10, 15]
    System.out.println(bellRow(6));    // prints [203, 255, 322, 409, 523, 674, 877]
    System.out.println(bellNum(0, 0));  // prints 1
    System.out.println(bellNum(3, 2));  // prints 10
    System.out.println(bellNum(6, 3));  // prints 409
  }

  // Complete this method
  public static List<Integer> bellRow(int rowNum) {
    List<Integer> previous = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    previous.add(1);

    // How many rows should we be processing?
    for (int row = 0; row < rowNum; row++) {
      // What is the 0th element of the current row?
      current.add(previous.get(previous.size() - 1));
      // Fill in the current row by using data from the current row
      // and previous row
      for (int column = 0; column < previous.size(); column++) {
        current.add(previous.get(column) + current.get(column));
      }
      // The current row becomes the previous row and
      // the new current row gets initialized
      previous = current;
      current = new ArrayList<>();
    }

    // Return the Bell row ArrayList
    return previous;
  }

  public static int bellNum(int row, int column) {
    // Return the number from (row, column)
    return bellRow(row).get(column);
  }

}
