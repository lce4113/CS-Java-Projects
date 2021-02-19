package com.randp;

import java.util.ArrayList;

public class RandP {
  private final ArrayList<Integer> nums;

  public RandP(int n) {
    this.nums = new ArrayList<>(n);
    for (int i = 1; i <= n; i++) {
      this.nums.add(i);
    }
  }

  public int nextInt() {
    int n = this.nums.size();
    if (n == 0) return 0;
    int randInt = (int) (Math.random() * this.nums.size());
    int randp = this.nums.get(randInt);
    this.nums.remove(randInt);
    return randp;
  }
}
