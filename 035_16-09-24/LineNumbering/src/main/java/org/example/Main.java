package org.example;

import org.example.model.LineNumbering;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LineNumbering.number(Collections.emptyList()).forEach(System.out::println); // []

        LineNumbering.number(List.of("a", "b", "c")).forEach(System.out::println); // ["1: a", "2: b", "3: c"]

    }
}