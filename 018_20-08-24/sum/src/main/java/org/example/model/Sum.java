package org.example.model;

// https://www.codewars.com/kata/55f2b110f61eb01779000053/solutions/java

import java.util.stream.IntStream;

public class Sum {
    public int GetSum(int a, int b) {
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1)
                .sum();
    }

}
