package com.mobile;

public class Mobile extends Structure {

  private final Branch left;
  private final Branch right;

  public Mobile(Branch left, Branch right) {
    this.left = left;
    this.right = right;
  }

  public int getWeight() {
    return this.left.structure.getWeight() * this.left.length
            + this.right.structure.getWeight() * this.right.length;
  }

}
