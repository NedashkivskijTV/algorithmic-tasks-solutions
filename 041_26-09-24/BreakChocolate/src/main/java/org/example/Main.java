package org.example;

import org.example.model.Chocolate;

public class Main {
    public static void main(String[] args) {
        System.out.println(Chocolate.breakChocolate(2L, 1L)); // 1
        System.out.println(Chocolate.breakChocolate(3L, 1L)); // 2
        System.out.println(Chocolate.breakChocolate(5L, 5L)); // 24
    }
}