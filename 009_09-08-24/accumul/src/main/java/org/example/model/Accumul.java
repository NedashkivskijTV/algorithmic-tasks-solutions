package org.example.model;

// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java

public class Accumul {
    
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (i > 0) {
                result.append("-");
            }

            result.append(String.valueOf(currentChar).toUpperCase());

            if (i > 0) {
                result.append(String.valueOf(currentChar).toLowerCase().repeat(i));
            }
        }

        return result.toString();
    }

}
