package org.example.model;

// https://www.codewars.com/kata/67757660c552a3a7ef9aaceb/train/java

public class Solution {
    public static boolean validateBase(String num, int base) {
//        char charBase = (char) ('A' + base - 10);
//
//        for (char c : num.toCharArray()) {
//            if (Character.isDigit(c)) {
//                if (Integer.parseInt(String.valueOf(c)) >= base) {
//                    return false;
//                }
//            } else {
//                if (c >= charBase) {
//                    return false;
//                }
//            }
//
//        }
//        return true;

        return num.chars()
                .allMatch(c -> "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c) < base);
    }

}
