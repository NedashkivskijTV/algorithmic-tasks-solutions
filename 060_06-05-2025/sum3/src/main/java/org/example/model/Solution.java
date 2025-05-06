package org.example.model;

// https://codingbat.com/prob/p175763

import java.util.Arrays;

public class Solution {
    public int sum3(int[] nums) {
        return Arrays.stream(nums).sum();
    }

}

