package org.example.model;

// https://leetcode.com/problems/length-of-last-word/

public class Solution {
    public int lengthOfLastWord(String s) {
        // first solution
//        String[] strings = s.split("\\s+");
//        return strings[strings.length - 1].length();


        // second solution
        s = s.trim();

        int i = s.length() - 1;
        int length = 0;

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

}
