package com.mobile;

public class Weight extends Structure {

  public final int weight;

  public Weight(int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
  }
}

abstract class Structure {
  abstract int getWeight();
}