package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.validatePin("1234")); // true
        System.out.println(Solution.validatePin("12345")); // false
        System.out.println(Solution.validatePin("a234")); // false
        System.out.println(Solution.validatePin("1111")); // true
    }
}
