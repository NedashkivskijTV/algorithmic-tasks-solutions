package org.example;

import org.example.model.KthLargest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        KthLargest obj = new KthLargest(3, new int[] {4, 5, 8, 2});
        System.out.println(obj.add(3)); // 4
        System.out.println(obj.add(5)); // 5
        System.out.println(obj.add(10)); // 5
        System.out.println(obj.add(9)); // 8
        System.out.println(obj.add(4)); // 8
    }

}
