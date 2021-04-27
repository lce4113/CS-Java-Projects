package com.freeresponse;

import com.utils.ArrayUtils;

import java.util.Arrays;

public class LightBoard {
  /**
   * The lights on the board, where true represents on and false represents off.
   */
  private Boolean[][] lights;
  private final int r;
  private final int c;

  /**
   * Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols) {
    r = numRows;
    c = numCols;
    lights = new Boolean[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if (Math.random() <= 0.4) {
          lights[i][j] = true;
        } else {
          lights[i][j] = false;
        }
      }
    }
  }

  public static void main(String[] args) {
    LightBoard board = new LightBoard(5, 6);
    System.out.println(board);
    System.out.println(board.evaluateLight(2, 3));
  }

  /**
   * Evaluates a light in row index row and column index col and returns a status
   * as described in part (b).
   * Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col) {
    int on = 0;
    for (int i = 0; i < r; i++) {
      on += (lights[i][col - 1] ? 1 : 0);
    }
    if (lights[row - 1][col - 1]) {
      return (on % 2 != 0);
    } else {
      return (on % 3 == 0);
    }
  }

  public String toString() {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < r; i++) {
      if (i != 0) str.append('\n');
      for (int j = 0; j < c; j++) {
        if (j != 0) str.append(' ');
        str.append(lights[i][j] ? 1 : 0);
      }
    }
    return str.toString();
  }

}
