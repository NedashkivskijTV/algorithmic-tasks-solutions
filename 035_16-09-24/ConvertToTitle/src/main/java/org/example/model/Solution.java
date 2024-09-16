package org.example.model;

// https://leetcode.com/problems/excel-sheet-column-title/

public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;

            int symbolIndex = columnNumber % 26;
            char currentLetter = (char) ('A' + symbolIndex);
            result.append(currentLetter);

            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}