package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isSubsequence("abc", "ahbgdc")); // true
        System.out.println(new Solution().isSubsequence("axc", "ahbgdc")); // false
        System.out.println(new Solution().isSubsequence("b", "c")); // false
    }
}