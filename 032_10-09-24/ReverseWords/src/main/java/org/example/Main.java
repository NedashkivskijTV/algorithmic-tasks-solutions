package org.example;

import org.example.model.Kata;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.reverseWords("This is an example!")); // sihT si na !elpmaxe

        System.out.println(Kata.reverseWords("double  spaces")); // elbuod  secaps
    }
}