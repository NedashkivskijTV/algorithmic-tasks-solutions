package org.example;

import org.example.model.Kata;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.findShort("bitcoin take over the world maybe who knows perhaps")); // 3
        System.out.println(Kata.findShort("turns out random test cases are easier than writing out basic ones")); // 3
        System.out.println(Kata.findShort("Let's travel abroad shall we")); // 2
    }

}
