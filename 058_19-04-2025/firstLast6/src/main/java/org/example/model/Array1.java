package org.example.model;

// https://codingbat.com/prob/p185685
public class Array1 {

    private static final int NUMBER_SIX = 6;

    public boolean firstLast6(int[] nums) {
        return nums[0] == NUMBER_SIX || nums[nums.length - 1] == NUMBER_SIX;
    }

}

