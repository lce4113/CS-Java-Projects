package com.utils;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {

  private static final Scanner in = new Scanner(System.in);

  public static void runOnInt(LambdaFunction<Integer> lambdaFunction) {
    System.out.print("\nEnter a number ('q' or 'e' to exit): ");
    String res = in.nextLine();
    System.out.println();
    if (!res.matches("^[qe].*$")) {
      Matcher regexMatcher = Pattern.compile("[^\\d]*(\\d+)[^\\d]*").matcher(res);
      if (regexMatcher.find()) {
        int num = Integer.parseInt(regexMatcher.group(1));
        lambdaFunction.run(num);
      } else {
        System.out.println("Not a number.");
      }
      runOnInt(lambdaFunction);
    }
  }

  public static void runOnList(ListLambdaFunction<String> lambdaFunction) {
    System.out.print("\nEnter a list separated by commas ('q' or 'e' to exit): ");
    String res = in.nextLine();
    System.out.println();
    if (!res.matches("^[qe].*$")) {
      String[] arr = res.replace(" ", "").split(",");
      lambdaFunction.run(Arrays.asList(arr));
      runOnList(lambdaFunction);
    }
    lambdaFunction.run(new ArrayList<>());
  }

  public interface LambdaFunction<T> {
    void run(T num);
  }

  public interface ListLambdaFunction<T> {
    void run(List<T> nums);
  }

}
