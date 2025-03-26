package org.example.model;

// https://www.codewars.com/kata/566fc12495810954b1000030/train/java

import java.util.stream.IntStream;

public class CountDig {
    public static int nbDig(int n, int d) {
        String dToStr = String.valueOf(d);

        return IntStream.range(0, n + 1)
                .mapToObj(i -> String.valueOf(i * i))
                .mapToInt(s -> s.length() - s.replaceAll(dToStr, "").length())
                .sum();
    }

}
