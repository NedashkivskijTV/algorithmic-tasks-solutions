package org.example;

import org.example.model.NthSeries;

public class Main {
    public static void main(String[] args) {
        System.out.println(NthSeries.seriesSum(0)); // 0.00
        System.out.println(NthSeries.seriesSum(1)); // 1.00
        System.out.println(NthSeries.seriesSum(2)); // 1.25
        System.out.println(NthSeries.seriesSum(5)); // 1.57
    }
}