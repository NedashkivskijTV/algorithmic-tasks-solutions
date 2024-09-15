package org.example.model;

// https://www.codewars.com/kata/563cf89eb4747c5fb100001b/train/java

import java.util.stream.IntStream;

public class Remover {

    public static int[] removeSmallest(int[] numbers) {

        // first solution
/*        if (numbers == null || numbers.length == 0) {
            return numbers;
        }

        int minElementPosition = 0;
        int minElement = numbers[minElementPosition];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minElement) {
                minElement = numbers[i];
                minElementPosition = i;
            }
        }

        int[] resultArr = new int[numbers.length - 1];
        for (int i = 0; i < resultArr.length; i++) {
            if (i < minElementPosition) {
              resultArr[i] = numbers[i];
            }else {
                resultArr[i] = numbers[i + 1];
            }
        }

        return resultArr;*/


        // second solution
        int minElemPosition = IntStream.range(0, numbers.length)
                .reduce((i, j) -> numbers[i] > numbers[j] ? j : i)
                .orElse(-1);

        return IntStream.range(0, numbers.length)
                .filter(i -> i != minElemPosition)
                .map(i -> numbers[i])
                .toArray();
    }
}