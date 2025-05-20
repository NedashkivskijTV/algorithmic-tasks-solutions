package org.example.model;

// https://codingbat.com/prob/p109660

public class Solution {
    public int start1(int[] a, int[] b) {
        return (a.length > 0 && a[0] == 1 ? 1 : 0)
                + (b.length > 0 && b[0] == 1 ? 1 : 0);
    }

}
