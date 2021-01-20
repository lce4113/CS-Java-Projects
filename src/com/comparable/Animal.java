package com.comparable;

public class Animal implements Comparable<Animal> {

  public final String name;
  public int weight;

  public Animal() {
    this.weight = 1800;
    this.name = "Anonymous " + this.getClass().getSimpleName();
  }

  public Animal(int weight, String name) {
    this.weight = weight;
    this.name = name;
  }

  public void eat(int foodSize) {
    this.weight += foodSize;
  }

  public int compareTo(Animal animal) {
    return this.weight - animal.weight;
  }

  public String toString() {
    return this.name + ": " + this.weight;
  }

}