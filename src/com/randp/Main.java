package com.randp;

public class Main {
  public static void main(String[] args) {
    int x;
    RandP rand = new RandP(6);
    for (int i = 0; i < 8; i++) {
      x = rand.nextInt();
      System.out.println(x);
    }
  }
}
