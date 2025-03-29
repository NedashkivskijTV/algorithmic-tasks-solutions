package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution()
                .isPalindrome("A man, a plan, a canal: Panama")); // true

        System.out.println(new Solution()
                .isPalindrome("race a car")); // false

        System.out.println(new Solution()
                .isPalindrome(" ")); // true

        System.out.println(new Solution()
                .isPalindrome("0P")); // false
    }
}
