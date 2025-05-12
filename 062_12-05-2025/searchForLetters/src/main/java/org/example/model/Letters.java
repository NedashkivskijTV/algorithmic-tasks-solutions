package org.example.model;

// https://www.codewars.com/kata/52dbae61ca039685460001ae/train/java

public class Letters {
    public static String search(String line) {
        StringBuilder result = new StringBuilder("00000000000000000000000000");

        char letterA = 'a';
        char number1 = '1';

        for (int i = 0; i < line.length(); i++) {
            char currentSymbol = Character.toLowerCase(line.charAt(i));
            if (currentSymbol >= letterA
                    && currentSymbol < (letterA + result.toString().length())
                    && currentSymbol - letterA != number1) {
                result.setCharAt(currentSymbol - letterA, '1');
            }
        }

        return result.toString();
    }
}

/*
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Letters {
  static String search(String line) {
    return range(65, 91).mapToObj(c -> line.toUpperCase().indexOf(c) < 0 ? "0" : "1").collect(joining());
  }
}
 */