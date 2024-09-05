package org.example.model;

// https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java

import java.util.List;
import java.util.stream.Collectors;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String strBinary = binary.stream()
                .map(i -> String.valueOf(i))
                .collect(Collectors.joining());

        return Integer.parseInt(strBinary, 2);
    }

}
