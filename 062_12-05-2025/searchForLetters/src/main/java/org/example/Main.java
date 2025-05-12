package org.example;

import org.example.model.Letters;

public class Main {
    public static void main(String[] args) {
        System.out.println(Letters.search("a   **&  cZ")); // 10100000000000000000000001
        System.out.println(Letters.search("aaaaaaa79345675")); // 10000000000000000000000000
        System.out.println(Letters.search("&%#*")); // 00000000000000000000000000
    }
}