package org.example;

import org.example.model.Kata;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.isSatorSquare(new char[][]{
                {'T', 'E', 'N'},
                {'E', 'Y', 'E'},
                {'N', 'E', 'T'}
        })); // true

        System.out.println(Kata.isSatorSquare(new char[][]{
                {'N', 'O', 'T'},
                {'O', 'V', 'O'},
                {'N', 'O', 'T'}
        })); // false

        System.out.println(Kata.isSatorSquare(new char[][]{
                {'B', 'A', 'T', 'S'},
                {'A', 'B', 'U', 'T'},
                {'T', 'U', 'B', 'A'},
                {'S', 'T', 'A', 'B'}
        })); // true

        System.out.println(Kata.isSatorSquare(new char[][]{
                {'P', 'A', 'R', 'T'},
                {'A', 'G', 'A', 'R'},
                {'R', 'A', 'G', 'A'},
                {'T', 'R', 'A', 'M'}
        })); // false

    }

}
