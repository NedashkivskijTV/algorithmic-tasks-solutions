package org.example.model;

// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int[] replaceElements(int[] arr) {
        // second solution
        int arrLength = arr.length;
        int max_write_element = -1;

        for (int i = arrLength - 1; i >= 0; i--) {
            int currentElement = arr[i];
            arr[i] = max_write_element;
            max_write_element = Math.max(max_write_element, currentElement);
        }

        return arr;

        //first solution
//        int arrLength = arr.length;
//        int[] resultArr = new int[arrLength];
//        int maxElemPosition = -1;
//
//        for (int i = 0; i < arrLength; i++) {
//            if (i == arrLength - 1) {
//                resultArr[i] = -1;
//            } else {
//                if (maxElemPosition <= i) {
//                    maxElemPosition = maxElemPositionInWriteSubArray(arr, i);
//                }
//                resultArr[i] = arr[maxElemPosition];
//            }
//        }
//
//        return resultArr;
    }

    private int maxElemPositionInWriteSubArray(int[] arr, int i) {
        List<Integer> integerList = Arrays.stream(arr).boxed().toList();
        int max = IntStream.range(i + 1, arr.length).map(j -> integerList.get(j)).max().getAsInt();
        int maxPosition = integerList.indexOf(max);
        return maxPosition;
    }
}