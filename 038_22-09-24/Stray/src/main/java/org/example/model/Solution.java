package org.example.model;

// https://www.codewars.com/kata/57f609022f4d534f05000024/train/java

import java.util.Arrays;

public class Solution {
  public static int stray(int[] numbers) {
    if (numbers[0] == numbers[1]) {
      return Arrays.stream(numbers).filter(n -> n != numbers[0]).findFirst().getAsInt();
    }
    return numbers[0] == numbers[2] ? numbers[1] : numbers[0];
  }
}
