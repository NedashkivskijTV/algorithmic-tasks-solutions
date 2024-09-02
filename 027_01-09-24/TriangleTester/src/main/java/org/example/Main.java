package org.example;

import org.example.model.TriangleTester;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(TriangleTester.isTriangle(1,2,2)); // true
        System.out.println(TriangleTester.isTriangle(4,2,3)); // true
        System.out.println(TriangleTester.isTriangle(2,2,2)); // true
        System.out.println(TriangleTester.isTriangle(1,2,3)); // false
        System.out.println(TriangleTester.isTriangle(-5,1,3)); // false
        System.out.println(TriangleTester.isTriangle(0,2,3)); // false
        System.out.println(TriangleTester.isTriangle(1,2,9)); // false
    }
}