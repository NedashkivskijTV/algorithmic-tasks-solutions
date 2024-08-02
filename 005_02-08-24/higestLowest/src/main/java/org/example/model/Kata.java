package org.example.model;

import java.util.Arrays;

public class Kata {
    public static String highAndLow(String numbers) {
        String[] numbersStrArray = numbers.split(" ");

        int[] numbersIntArray = Arrays.stream(numbersStrArray)
                .map(s -> Integer.parseInt(s))
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        return  numbersIntArray[numbersIntArray.length  -  1]
                + " "
                + numbersIntArray[0];
    }

}
