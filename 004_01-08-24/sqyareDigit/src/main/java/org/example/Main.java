package org.example;

import org.example.model.SquareDigit;

public class Main {
    public static void main(String[] args) {
        System.out.println(new SquareDigit().squareDigits(9119)); // 811181
        System.out.println(new SquareDigit().squareDigits(765)); // 493625
    }
}