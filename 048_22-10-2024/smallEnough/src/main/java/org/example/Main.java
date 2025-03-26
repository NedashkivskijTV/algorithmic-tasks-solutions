package org.example;

import org.example.model.Kata;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.smallEnough(
                new int[] {66, 101},
                200
        )); // true

        System.out.println(Kata.smallEnough(
                new int[] {78, 117, 110, 99, 104, 117, 107, 115},
                100
        )); // false

    }
}