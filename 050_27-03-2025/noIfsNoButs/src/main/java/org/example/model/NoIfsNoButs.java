package org.example.model;

// https://www.codewars.com/kata/592915cc1fad49252f000006/train/java

public class NoIfsNoButs {
  
    public static String noIfsNoButs(int a, int b) {     
        return switch (Integer.compare(a, b)) {
            case 1 -> a + " is greater than " + b;
            case -1 -> a + " is smaller than " + b;
            default -> a + " is equal to " + b;
        };
    }
}


/*
    public static String noIfsNoButs(int a, int b) {
       while(a < b) return String.format("%d is smaller than %d", a, b);
       while(a > b) return String.format("%d is greater than %d", a, b);
       return String.format("%d is equal to %d", a, b);
    }
 */