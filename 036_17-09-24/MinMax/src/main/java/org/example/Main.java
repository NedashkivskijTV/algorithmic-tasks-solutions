package org.example;

import org.example.model.MinMax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(MinMax.minMax(new int[]{1, 2, 3, 4, 5}))); // 1,5
        System.out.println(Arrays.toString(MinMax.minMax(new int[]{2334454, 5}))); // 5,2334454
        System.out.println(Arrays.toString(MinMax.minMax(new int[]{1}))); // 1,1
    }
}