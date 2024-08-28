package org.example;

import org.example.model.Kata;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(Kata.solution("abc", "bc")); // true
        System.out.println(Kata.solution("abc", "d")); // false

    }
}