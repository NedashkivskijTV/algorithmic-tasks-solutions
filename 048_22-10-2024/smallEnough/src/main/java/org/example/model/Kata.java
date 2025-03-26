package org.example.model;

// https://www.codewars.com/kata/57cc981a58da9e302a000214/train/java

import java.util.Arrays;

public class Kata {
    public static boolean smallEnough(int[] a, int limit) {
        return Arrays.stream(a).allMatch(i -> i <= limit);
    }

}