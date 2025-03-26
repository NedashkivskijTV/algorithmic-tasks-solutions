package org.example;

import org.example.model.ProperFractions;

public class Main {
    public static void main(String[] args) {
        System.out.println(ProperFractions.properFractions(1)); // 0
        System.out.println(ProperFractions.properFractions(2)); // 1
        System.out.println(ProperFractions.properFractions(5)); // 4
        System.out.println(ProperFractions.properFractions(15)); // 8
        System.out.println(ProperFractions.properFractions(25)); // 20
    }

}
