package org.example;

// https://leetcode.com/problems/majority-element/

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        System.out.println(new Solution()
                .majorityElement(
                        new int[]{3, 2, 3}));

        System.out.println(new Solution()
                .majorityElement(
                        new int[]{2,2,1,1,1,2,2}));

    }
}