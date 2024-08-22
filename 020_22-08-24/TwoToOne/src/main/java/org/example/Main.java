package org.example;

import org.example.model.TwoToOne;

public class Main {
    public static void main(String[] args) {
        System.out.println(TwoToOne
                .longest("xyaabbbccccdefww", "xxxxyyyyabklmopq")); // abcdefklmopqwxy
        System.out.println(TwoToOne
                .longest("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz")); // abcdefghijklmnopqrstuvwxyz
    }
}