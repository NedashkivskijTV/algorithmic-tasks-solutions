package org.example;

import org.example.model.SumArray;

public class Main {
    public static void main(String[] args) {
        System.out.println(SumArray.sum(new double[] {1, 5.2, 4, 0, -1})); // 9.2
        System.out.println(SumArray.sum(new double[] {0})); // 0.0
        System.out.println(SumArray.sum(new double[] {})); // 0.0
        System.out.println(SumArray.sum(new double[] {-2.398})); // -2.398
    }
}