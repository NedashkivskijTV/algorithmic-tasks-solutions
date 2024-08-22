package org.example.model;

// https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java

public class TwoToOne {
    /**
     * Take 2 strings s1 and s2 including only letters from a to z.
     * Return a new sorted string, the longest possible, containing
     * distinct letters - each taken only once - coming from s1 or s2.
     *
     * Examples:
     * a = "xyaabbbccccdefww"
     * b = "xxxxyyyyabklmopq"
     * longest(a, b) -> "abcdefklmopqwxy"
     */

    public static String longest (String s1, String s2) {
        return s1.concat(s2).chars()
                .sorted()
                .distinct()
                .mapToObj(c -> (char) c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
