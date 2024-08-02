package org.example;

import org.example.model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution()
                .getConcatenation(new int[]{1,2,1}))); // 1,2,1,1,2,1

        System.out.println(Arrays.toString(new Solution()
                .getConcatenation(new int[]{1,3,2,1}))); // 1,3,2,1,1,3,2,1
    }

}
