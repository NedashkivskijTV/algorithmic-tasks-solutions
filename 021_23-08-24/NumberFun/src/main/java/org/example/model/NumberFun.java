package org.example.model;

// https://www.codewars.com/kata/56269eb78ad2e4ced1000013/train/java

public class NumberFun {
  public static long findNextSquare(long sq) {
      double sqrtOfSq = Math.sqrt(sq);
      if (sqrtOfSq % 1 != 0) {
          return -1;
      }
      return (long) ((sqrtOfSq + 1) * (sqrtOfSq + 1));
  }
}