package org.example;

import org.example.model.Vowels;

public class Main {
    public static void main(String[] args) {
        System.out.println(Vowels.getCount("number")); // 2
        System.out.println(Vowels.getCount("We will consider")); // 5
        System.out.println(Vowels.getCount("W wll cnsdr")); // 0
    }
}