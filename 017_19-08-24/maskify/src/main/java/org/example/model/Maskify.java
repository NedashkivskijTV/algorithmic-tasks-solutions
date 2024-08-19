package org.example.model;

// https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java

public class Maskify {
    public static String maskify(String str) {
        if (str.length() < 4) {
            return str;
        }

        return "#".repeat(str.length() - 4)
                + str.substring(str.length() - 4);
    }

}

