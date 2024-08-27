package org.example.model;

// https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
public class Solution {

  public static boolean validatePin(String pin) {
    //int pinLength = pin.length();

    return pin.matches("\\d{4}|\\d{6}");
  }

}
