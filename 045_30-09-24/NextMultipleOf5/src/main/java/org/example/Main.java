package org.example;

import org.example.model.RoundToTheNextMultipleOf5;

public class Main {
    public static void main(String[] args) {
        System.out.println(RoundToTheNextMultipleOf5.roundToNext5(0)); // 0
        System.out.println(RoundToTheNextMultipleOf5.roundToNext5(2)); // 5
        System.out.println(RoundToTheNextMultipleOf5.roundToNext5(3)); // 5
        System.out.println(RoundToTheNextMultipleOf5.roundToNext5(12)); // 15
    }
}
