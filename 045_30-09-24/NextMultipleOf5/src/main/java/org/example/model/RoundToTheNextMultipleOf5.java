package org.example.model;

// https://www.codewars.com/kata/55d1d6d5955ec6365400006d/train/java

public class RoundToTheNextMultipleOf5 {
  public static int roundToNext5(int number) {
    while (number % 5 != 0) {
      number++;
    }
    return number;
  }
}
