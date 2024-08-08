package org.example;

import org.example.model.Kata;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.getMiddle("test")); // es
        System.out.println(Kata.getMiddle("testing")); // t
        System.out.println(Kata.getMiddle("middle")); // dd
        System.out.println(Kata.getMiddle("A")); // A
        System.out.println(Kata.getMiddle("")); // ""
    }
}