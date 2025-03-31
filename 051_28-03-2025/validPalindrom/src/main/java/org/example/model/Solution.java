package org.example.model;

// https://leetcode.com/problems/valid-palindrome/

public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder letters = new StringBuilder();

        for (char symbol : s.toCharArray()) {
            if (Character.isLetter(symbol) || Character.isDigit(symbol)) {
                letters.append(Character.toLowerCase(symbol));
            }
        }

        int length = letters.length();

        for (int i = 0; i < length / 2; i++) {
            if (letters.charAt(i) != letters.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
