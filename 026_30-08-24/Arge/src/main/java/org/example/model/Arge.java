package org.example.model;

// https://www.codewars.com/kata/563b662a59afc2b5120000c6/train/java

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        double increase = 100 / percent;

        while (p0 < p) {
            p0 += p0 / increase + aug;
            years++;
        }

        return years;
    }
}
