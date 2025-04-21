package org.example;

import org.example.model.Task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Task1().sameFirstLast(new int[]{1, 2, 3})); //false
        System.out.println(new Task1().sameFirstLast(new int[]{1, 2, 3, 1})); //true
        System.out.println(new Task1().sameFirstLast(new int[]{1, 2, 1})); //true
    }

}
