package com.movies;

public class Movie implements Comparable<Movie> {
  private final String name;
  private double rating;

  public Movie(String nm, double rt) {
    this.name = nm;
    this.rating = rt;
  }

  // Complete this method. Used to sort movies by rating in ascending order
  public int compareTo(Movie movie) {
    // YOUR CODE HERE
    return (int) (this.rating - movie.rating);
  }

}
