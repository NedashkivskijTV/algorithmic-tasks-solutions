package org.example;

import org.example.model.Square;

public class Main {
    public static void main(String[] args) {
        System.out.println(Square.isSquare(-1)); // false
        System.out.println(Square.isSquare(0)); // true
        System.out.println(Square.isSquare(3)); // false
        System.out.println(Square.isSquare(4)); // true
        System.out.println(Square.isSquare(25)); // true
        System.out.println(Square.isSquare(26)); // false
    }

}
