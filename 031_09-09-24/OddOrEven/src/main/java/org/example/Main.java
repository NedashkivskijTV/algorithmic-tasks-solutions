package org.example;

import org.example.model.Codewars;

public class Main {
    public static void main(String[] args) {
        System.out.println(Codewars.oddOrEven(new int[]{0})); // even
        System.out.println(Codewars.oddOrEven(new int[]{0,1,4})); // odd
        System.out.println(Codewars.oddOrEven(new int[]{0, -1, -5})); // even
        System.out.println(Codewars.oddOrEven(new int[]{2, 5, 34, 6})); // odd
    }
}