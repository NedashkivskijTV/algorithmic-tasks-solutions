package org.example;

import org.example.model.FindDivisor;

public class Main {
    public static void main(String[] args) {
        System.out.println(new FindDivisor().numberOfDivisors(4)); // 3
        System.out.println(new FindDivisor().numberOfDivisors(5)); // 2
        System.out.println(new FindDivisor().numberOfDivisors(12)); // 6
        System.out.println(new FindDivisor().numberOfDivisors(30)); // 8
    }
}