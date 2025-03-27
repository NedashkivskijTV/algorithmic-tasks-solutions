package org.example;

import org.example.model.NoIfsNoButs;

public class Main {
    public static void main(String[] args) {
        System.out.println(NoIfsNoButs.noIfsNoButs(5, 4)); // "5 is greater than 4"
        System.out.println(NoIfsNoButs.noIfsNoButs(-4, -7)); // "-4 is greater than -7"
        System.out.println(NoIfsNoButs.noIfsNoButs(2, 2)); // "2 is equal to 2"
    }
}