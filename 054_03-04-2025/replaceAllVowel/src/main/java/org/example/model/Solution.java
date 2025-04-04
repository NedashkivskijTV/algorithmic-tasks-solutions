package org.example.model;

// https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed/train/java
public class Solution {
    public static String replace(final String s) {
//        String vowels = "aeiouAEIOU";
//        StringBuilder resultString = new StringBuilder();
//
//        for (char c : s.toCharArray()) {
//            if (vowels.contains(String.valueOf(c))) {
//                resultString.append("!");
//            } else {
//                resultString.append(c);
//            }
//        }
//
//        return resultString.toString();

        return s.replaceAll("[aeiouAEIOU]", "!");
    }

}
