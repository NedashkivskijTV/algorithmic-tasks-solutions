package org.example.model;

// https://www.codewars.com/kata/56cafdabc8cfcc3ad4000a2b/train/java

import java.math.BigInteger;

public class BinaryScore {
  public static BigInteger score (BigInteger n) {
      if (n.equals(BigInteger.ZERO)) {
          return BigInteger.ZERO;
      }
      BigInteger highestBit = BigInteger.ONE.shiftLeft(n.bitLength() - 1);
      return highestBit.shiftLeft(1).subtract(BigInteger.ONE);
  }
}

/*
 return BigInteger.valueOf(2).pow(n.bitLength()).subtract(BigInteger.valueOf(1));
 */