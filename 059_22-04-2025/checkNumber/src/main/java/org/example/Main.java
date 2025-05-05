package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.validateBase("17253", 8)); // true
        System.out.println(Solution.validateBase("17253", 2)); // false
        System.out.println(Solution.validateBase("ABCDEF", 16)); // true
    }

}
