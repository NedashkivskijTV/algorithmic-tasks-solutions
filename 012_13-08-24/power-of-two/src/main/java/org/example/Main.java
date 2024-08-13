package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(1)); // true
        System.out.println(new Solution().isPowerOfTwo(16)); // true
        System.out.println(new Solution().isPowerOfTwo(3)); // false
        System.out.println(new Solution().isPowerOfTwo(536870912)); // true
        System.out.println(new Solution().isPowerOfTwo(16777217)); // false
    }
}