package com.mobile;

public class Mobile implements Structure {

  private final Branch left;
  private final Branch right;

  public Mobile(Branch left, Branch right) {
    this.left = left;
    this.right = right;
  }

  public int totalWeight() {
    int total = 0;
    for (final Branch branch : new Branch[]{this.left, this.right}) {
      total += ((branch.structure instanceof Weight) ?
              ((Weight) branch.structure).weight :
              ((Mobile) branch.structure).totalWeight()) *
              branch.length;
    }
    return total;
  }

}
