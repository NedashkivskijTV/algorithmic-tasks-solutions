package org.example;

import org.example.model.Kata;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.highAndLow("1 2 3 4 5")); // "5 1"
        System.out.println(Kata.highAndLow("1 2 -3 4 5")); // "5 -3"
        System.out.println(Kata.highAndLow("1 9 3 4 -5")); // "9 -5"
    }
}