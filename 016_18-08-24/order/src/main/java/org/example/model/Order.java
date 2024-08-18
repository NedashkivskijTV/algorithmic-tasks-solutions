package org.example.model;

// https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

public class Order {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }

        String[] wordsArr = words.split("\\s+");
        String[] resultArr = new String[wordsArr.length];

        for (String word : wordsArr) {
            for (int i = 0; i < word.length(); i++) {
                char symbol = word.charAt(i);
                if (Character.isDigit(symbol)) {
                    int index = Integer.parseInt(String.valueOf(symbol));
                    resultArr[index - 1] = word;
                    break;
                }
            }
        }

        return String.join(" ", resultArr);
    }

}
