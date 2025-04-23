package org.example;

import org.example.model.CommonEnd;

public class Main {
    public static void main(String[] args) {
        System.out.println(new CommonEnd().commonEnd(new int[] {1,2,3}, new int[] {7, 3})); // true
        System.out.println(new CommonEnd().commonEnd(new int[] {1,2,3}, new int[] {7, 3, 2})); // false
        System.out.println(new CommonEnd().commonEnd(new int[] {1,2,3}, new int[] {1, 3})); // true
    }
}