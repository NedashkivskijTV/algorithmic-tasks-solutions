package org.example;

import org.example.model.Sum;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Sum().GetSum(1, 0)); // 1
        System.out.println(new Sum().GetSum(1, 2)); // 3
        System.out.println(new Sum().GetSum(0, 1)); // 4
        System.out.println(new Sum().GetSum(1, 1)); // 1
        System.out.println(new Sum().GetSum(-1, 0)); // -1
        System.out.println(new Sum().GetSum(-1, 2)); // 2
    }
}
