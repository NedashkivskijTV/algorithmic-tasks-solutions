package org.example;

import org.example.model.Kata;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.isAnagram("foefet", "toffee")); // true
        System.out.println(Kata.isAnagram("Buckethead", "DeathCubeK")); // true
    }
}