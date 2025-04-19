package org.example;

import org.example.model.Array1;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Array1().firstLast6(new int[] {1,2,6})); // true
        System.out.println(new Array1().firstLast6(new int[] {6, 1, 2, 3})); // true
        System.out.println(new Array1().firstLast6(new int[] {13, 6, 1, 2, 3})); // false
    }
}