package org.example.model;

import java.util.Arrays;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}

/*
 //long algorithm
        if (s.length() != t.length()) {
            return false;
        }

        String sWord = s;
        String tWord = t;

        for (int i = 0; i < s.length(); i++) {
            sWord = sWord.replace(String.valueOf(s.charAt(i)), "");
            tWord = tWord.replace(String.valueOf(s.charAt(i)), "");
            if (sWord.length() != tWord.length()) {
                return false;
            }
        }

        return true;
*/


/*
 //longer algorithm
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> symbolsMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
             symbolsMap.put(s.charAt(i), symbolsMap.getOrDefault(s.charAt(i), 0) + 1);
             symbolsMap.put(t.charAt(i), symbolsMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (Integer value : symbolsMap.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;*/
