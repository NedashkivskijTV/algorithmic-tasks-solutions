package org.example.model;

// https://leetcode.com/problems/excel-sheet-column-number/

public class Solution {
    public int titleToNumber(String columnTitle) {
        int characterZero = 'A' - 1;
        int rezNumber = 0;

        for (int i = 0; i < columnTitle.length() ; i++) {
            char currentChar = columnTitle.charAt(i);
            int currentCharNumber = currentChar - characterZero;
            rezNumber = rezNumber * 26 + currentCharNumber;
        }

        return rezNumber;
    }
}