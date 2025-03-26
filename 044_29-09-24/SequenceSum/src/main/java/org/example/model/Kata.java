package org.example.model;

// https://codewars.com/kata/586f6741c66d18c22800010a/train/java

public class Kata {
  public static int sequenceSum(int start, int end, int step) {
    // first solution
/*
    int result = 0;
    for (int i = start; i <= end; i += step) {
      result += i;
    }
    return result;
*/

    // second solution
    if (start > end) {
      return 0;
    }
    return start + (sequenceSum(start += step, end, step));
  }

}
