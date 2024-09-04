package org.example.model;

// https://leetcode.com/problems/verifying-an-alien-dictionary/

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < words[i - 1].length(); j++) {
                if (words[i - 1].length() == j) {
                    break;
                }
                if (words[i].length() == j) {
                    return false;
                }
                if (order.indexOf(words[i - 1].charAt(j)) < order.indexOf(words[i].charAt(j))) {
                    break;
                }
                if (order.indexOf(words[i - 1].charAt(j)) > order.indexOf(words[i].charAt(j))) {
                    return false;
                }
            }
        }

        return true;
    }

}
