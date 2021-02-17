package com.movies;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    // Create an ArrayList that holds movies.
    ArrayList<Movie> movies = new ArrayList<>();
    // Add your favorite movie to the ArrayList and give it a rating.
    movies.add(new Movie("Phineas and Ferb the Movie: Across the 2nd Dimension", 9.2));
    // Add the Netflix Series “Sherlock” to the ArrayList. It has 4 seasons and a rating of 9.1.
    movies.add(new NetflixSeries("Sherlock", 4, 9.1));

  }
}