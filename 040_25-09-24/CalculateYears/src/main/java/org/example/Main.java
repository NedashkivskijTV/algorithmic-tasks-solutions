package org.example;

import org.example.model.Money;

public class Main {
    public static void main(String[] args) {
        System.out.println(Money.calculateYears(1000.0,
                0.05,
                0.18,
                1100.0)); // 3
    }
}