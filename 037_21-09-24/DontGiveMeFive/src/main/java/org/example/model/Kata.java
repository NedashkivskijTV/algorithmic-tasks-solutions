package org.example.model;

// https://www.codewars.com/kata/5813d19765d81c592200001a/train/java

public class Kata {
    public static int dontGiveMeFive(int start, int end) {
        int resultNonFive = 0;

        for (int i = start; i <= end; i++) {
            String currentNumberToStr = String.valueOf(i);
            //if (currentNumberToStr.charAt(currentNumberToStr.length() - 1) == '5'){
            if (currentNumberToStr.contains("5")){
                continue;
            }
            resultNonFive++;
        }

        return resultNonFive;
    }
}