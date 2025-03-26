package org.example.model;

// https://www.codewars.com/kata/583f158ea20cfcbeb400000a/train/java

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ArithmeticFunction {
  public static Map<String, BinaryOperator<Integer>> operatorMap = new HashMap<>();

  static {
    operatorMap.put("add", (a, b) -> a + b);
    operatorMap.put("subtract", (a, b) -> a - b);
    operatorMap.put("multiply", (a, b) -> a * b);
    operatorMap.put("divide", (a, b) -> a / b);
  }

  // second solution
  public static int arithmetic(int a, int b, String operator) {
    return arithmetic(a, b, operatorMap.get(operator));
  }

  private static int arithmetic(int a, int b, BinaryOperator<Integer> integerBinaryOperator) {
    //return integerBinaryOperator.apply(a, b);
    return Optional.ofNullable(integerBinaryOperator)
            .orElseThrow(() -> new IllegalArgumentException("Illegal operator"))
            .apply(a, b);
  }


  // first solution
/*  public static int arithmetic(int a, int b, String operator) {
    int result = 0;

    switch (operator) {
      case "add": {
        result = a + b;
        break;
      }
      case "subtract": {
        result = a - b;
        break;
      }
      case "multiply": {
        result = a * b;
        break;
      }
      case "divide": {
        result = a / b;
        break;
      }
      default: {
        throw new IllegalArgumentException("Non supported operator - " + operator);
      }
    }

    return result;
  }*/

}
