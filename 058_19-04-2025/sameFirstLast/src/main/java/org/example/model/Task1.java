package org.example.model;

// https://codingbat.com/prob/p118976

public class Task1 {
    public boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }

}
