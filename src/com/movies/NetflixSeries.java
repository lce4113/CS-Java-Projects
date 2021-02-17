package com.movies;

public class NetflixSeries extends Movie {
  private double numSeasons;

  public NetflixSeries(String nm, double rt, double numSeasons) {
    super(nm, rt);
    this.numSeasons = numSeasons;
  }

}
