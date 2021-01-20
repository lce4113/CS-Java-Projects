package com.comparable;

import java.lang.Comparable;

/*
 Question #2:
 "Comparable<Cow>" allows type safety in the
 comparable method for the cow parameter.
 "Comparable" alone forces the use of the
 Object type in the cow parameter.

 Question #3:
 If "implements Comparable<Cow>" is removed,
 then the Arrays.sort function can't use the
 Cow objects. This is because it only accepts
 the Comparable type and the Cow class no
 longer implements it.
*/
public class Cow1 implements Comparable<Cow1> {

  private final int weight;
  private final String name;

  public Cow1() {
    this.weight = 1800;
    this.name = "Anonymous Cow";
  }

  public Cow1(int weight, String name) {
    this.weight = weight;
    this.name = name;
  }

  public String toString() {
    return this.name;
  }

  public int compareTo(Cow1 cow) {
    return this.weight - cow.weight;
  }

}
