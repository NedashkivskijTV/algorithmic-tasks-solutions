package org.example;

import org.example.model.Kata;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.greet("Daniel", "Daniel")); // Hello boss

        System.out.println(Kata.greet("Greg", "Daniel")); // Hello guest
    }
}
