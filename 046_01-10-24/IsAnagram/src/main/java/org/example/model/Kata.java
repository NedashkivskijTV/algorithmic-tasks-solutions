package org.example.model;

// https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java

import java.util.Arrays;

public class Kata {
    public static boolean isAnagram(String a, String b) {
        char[] aArray = a.toLowerCase().toCharArray();
        Arrays.sort(aArray);
        char[] bArray = b.toLowerCase().toCharArray();
        Arrays.sort(bArray);

        return Arrays.equals(aArray, bArray);
    }

}
