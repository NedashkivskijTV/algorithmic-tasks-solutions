package org.example.model;

// https://codingbat.com/prob/p109537

import java.util.Arrays;

public class Solution {
    public int[] biggerTwo(int[] a, int[] b) {
        return Arrays.stream(a).sum() < Arrays.stream(b).sum() ? b : a;
    }

}
