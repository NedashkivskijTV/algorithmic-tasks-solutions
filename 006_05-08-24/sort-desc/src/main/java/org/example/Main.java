package org.example;

//https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

import org.example.model.DescendingOrder;

public class Main {
    public static void main(String[] args) {
        System.out.println(DescendingOrder.sortDesc(42145)); // 54421
        System.out.println(DescendingOrder.sortDesc(145263)); // 654321
        System.out.println(DescendingOrder.sortDesc(123456789)); // 987654321
    }
}