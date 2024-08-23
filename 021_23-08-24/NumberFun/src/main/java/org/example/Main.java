package org.example;

import org.example.model.NumberFun;

public class Main {
    public static void main(String[] args) {
        System.out.println(NumberFun.findNextSquare(121)); // 144
        System.out.println(NumberFun.findNextSquare(625)); // 676
        System.out.println(NumberFun.findNextSquare(114)); // -1
    }
}