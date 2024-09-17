package org.example.model;

// https://leetcode.com/problems/greatest-common-divisor-of-strings/

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        for (int i = str1.length(); i >= 0; i--) {
            String substring = str1.substring(0, i);
            if (str1.replace(substring, "").isEmpty()
                    && str2.replace(substring, "").isEmpty()) {
                return substring;
            }
        }

        return "";
    }

}
