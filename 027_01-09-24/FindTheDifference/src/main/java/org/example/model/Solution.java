package org.example.model;

// https://leetcode.com/problems/find-the-difference/

import java.util.Arrays;

public class Solution {
    public char findTheDifference(String s, String t) {
        char[] charsFormS = s.toCharArray();
        Arrays.sort(charsFormS);
        char[] charsFormT = t.toCharArray();
        Arrays.sort(charsFormT);

        for (int i = 0; i < s.length(); i++) {
            if (charsFormS[i] != charsFormT[i]) {
                return charsFormT[i];
            }
        }

        return charsFormT[charsFormT.length - 1];
    }

}
