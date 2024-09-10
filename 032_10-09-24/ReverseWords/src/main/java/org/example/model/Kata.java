package org.example.model;

// https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java

public class Kata {
    public static String reverseWords(final String original) {
        StringBuilder resultString = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            if (c == ' ') {
                resultString.append(currentWord.reverse()).append(c);
                currentWord.delete(0, currentWord.length());
            } else {
                currentWord.append(c);
            }

            if (i == original.length() - 1) {
                resultString.append(currentWord.reverse());
            }
        }

        return resultString.toString();
    }

}
