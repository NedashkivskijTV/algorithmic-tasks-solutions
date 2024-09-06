package org.example.model;

// https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java

import java.util.ArrayList;

public class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
// first solution
//    int result = 0;
//    for (int[] stop : stops) {
//      result += stop[0];
//      result -= stop[1];
//    }
//    return result;

    return stops.stream()
            .mapToInt(m -> m[0] - m[1])
            .sum();
  }
}