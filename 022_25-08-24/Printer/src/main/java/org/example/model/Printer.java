package org.example.model;

// https://www.codewars.com/kata/56541980fa08ab47a0000040/train/java

public class Printer {
    
    public static String printerError(String s) {
        int mistakesCounter = (int) s.chars()
                .filter(c -> c > 'm')
                .count();

        return mistakesCounter + "/" + s.length();
    }

}
