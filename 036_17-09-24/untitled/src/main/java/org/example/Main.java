package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().gcdOfStrings("ABCABC", "ABC")); // ABC
        System.out.println(new Solution().gcdOfStrings("ABABAB", "ABAB")); // AB
        System.out.println(new Solution().gcdOfStrings("LEET", "CODE")); // ""
    }
}