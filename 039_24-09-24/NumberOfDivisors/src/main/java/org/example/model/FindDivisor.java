package org.example.model;

// https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java

import java.util.stream.IntStream;

public class FindDivisor {

  public long numberOfDivisors(int n) {
    // first solution
/*
    long divisorCounter = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        divisorCounter++;
      }
    }
    return divisorCounter;
*/

    // second solution
    return IntStream.range(1, n + 1).filter(i -> n % i == 0).count();
  }

}
