package org.example.model;

// https://leetcode.com/problems/kth-largest-element-in-a-stream/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KthLargest {
    private int k;
    private List<Integer> nums;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = Arrays.stream(nums)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }

    public int add(int val) {
        nums.add(val);
        nums.sort(Comparator.naturalOrder());
        return nums.get(nums.size() - k);
    }
    
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */