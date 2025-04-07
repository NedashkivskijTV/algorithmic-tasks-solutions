package org.example;

import org.example.model.Collatz;

public class Main {
    public static void main(String[] args) {
        System.out.println(Collatz
                .collatz(4)); // "4->2->1"

        System.out.println(Collatz
                .collatz(3)); // "3->10->5->16->8->4->2->1"
    }
}