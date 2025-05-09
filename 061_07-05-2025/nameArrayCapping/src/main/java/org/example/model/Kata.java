package org.example.model;

// https://www.codewars.com/kata/5356ad2cbb858025d800111d/train/java

import java.util.Arrays;

public class Kata {
    public static String[] capMe(String[] strings) {
        return Arrays.stream(strings)
                .map(s -> s.length() == 0 ?
                        "" :
                        s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase()))
                .toList()
                .toArray(new String[0]);
    }

}
