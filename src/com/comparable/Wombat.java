package com.comparable;

public class Wombat extends Animal {
  public Wombat() {
    super();
  }

  public Wombat(int weight, String name) {
    super(weight, name);
  }

  @Override
  public void eat(int foodSize) {
    System.out.println("Wombats don't gain weight when they eat!");
  }
}
