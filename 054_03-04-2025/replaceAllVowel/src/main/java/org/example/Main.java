package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.replace("Hi!")); // H!!
        System.out.println(Solution.replace("!Hi! Hi!")); // !H!! H!!
        System.out.println(Solution.replace("aeiou")); // !!!!!
        System.out.println(Solution.replace("ABCDE")); // !BCD!
    }

}
