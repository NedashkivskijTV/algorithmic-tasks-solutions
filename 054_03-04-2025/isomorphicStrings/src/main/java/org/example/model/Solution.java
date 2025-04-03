package org.example.model;

// https://leetcode.com/problems/isomorphic-strings/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        // TODO

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> lettersMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!lettersMap.containsKey(s.charAt(i))) {
                if (lettersMap.containsValue(t.charAt(i))) {
                    return false;
                }
                lettersMap.put(s.charAt(i), t.charAt(i));
            } else if (lettersMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }

        return true;
    }

}
