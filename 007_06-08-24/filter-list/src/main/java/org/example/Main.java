package org.example;

import org.example.model.Kata;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kata.filterList(List.of(1, 2, "a", "b")).forEach(System.out::println); // 1, 2

        Kata.filterList(List.of(1, "a", "b", 0, 15)).forEach(System.out::println); // 1, 0, 15

        Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)).forEach(System.out::println); // 1, 2, 123
    }

}
