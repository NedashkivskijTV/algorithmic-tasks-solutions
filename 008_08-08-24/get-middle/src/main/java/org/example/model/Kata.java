package org.example.model;

//https://www.codewars.com/kata/56747fd5cb988479af000028/train/java

public class Kata {
    public static String getMiddle(String word) {
        int wordLength = word.length();

        if (wordLength < 2) {
            return word;
        }

        int middle = wordLength / 2;

        if (word.length() % 2 == 0) {
            return word.substring(middle - 1, middle + 1);
        }

        return word.substring(middle, middle + 1);
    }

}
