package org.example;

import org.example.model.Kata;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.sequenceSum(2,2,2)); // 2
        System.out.println(Kata.sequenceSum(2,6,2)); // 12
        System.out.println(Kata.sequenceSum(1,5,1)); // 15
        System.out.println(Kata.sequenceSum(1,5,3)); // 5
    }
}