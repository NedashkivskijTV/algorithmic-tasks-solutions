package org.example.model;

// https://www.codewars.com/kata/593b1909e68ff627c9000186/train/java

public class Generator {
    public static String nickname(String name) {
        // TODO
        String vowels = "aeiou";
        if (name.length() < 4) {
            return "Error: Name too short";
        }
//        if (vowels.contains(String.valueOf(name.charAt(2)))) {
//            return name.substring(0, 4);
//        }
//
//        return name.substring(0, 3);

        return (vowels.contains(String.valueOf(name.charAt(2)))) ? name.substring(0,4) : name.substring(0, 3);
    }
}