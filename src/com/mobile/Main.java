package com.mobile;

public class Main {
  public static void main(String[] args) {
    Mobile mobile = new Mobile(
            new Branch(5, new Mobile(
                    new Branch(5, new Weight(4)),
                    new Branch(5, new Weight(5))
            )),
            new Branch(5, new Weight(5))
    );
    System.out.println(mobile.getWeight());
  }
}
