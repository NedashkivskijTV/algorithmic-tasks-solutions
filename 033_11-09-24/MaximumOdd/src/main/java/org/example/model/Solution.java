package org.example.model;

// https://leetcode.com/problems/maximum-odd-binary-number/

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public String maximumOddBinaryNumber(String s) {
        String[] numbers = s.split("");

        Arrays.sort(numbers, Collections.reverseOrder());

        if (!numbers[numbers.length - 1].equals("1")) {
            for (int i = numbers.length - 1;  i >= 0 ; i--) {
                if (numbers[i].equals("1")) {
                    numbers[i] = "0";
                    numbers[numbers.length - 1] = "1";
                    break;
                }
            }
        }

        return String.join("", numbers);
    }

}
