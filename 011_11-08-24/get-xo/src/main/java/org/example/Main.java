package org.example;

import org.example.model.XO;

public class Main {
    public static void main(String[] args) {
        System.out.println(XO.getXO("ooxx")); // true
        System.out.println(XO.getXO("xooxx")); // false
        System.out.println(XO.getXO("ooxXm")); // true
        System.out.println(XO.getXO("zpzpzpp")); // true
        System.out.println(XO.getXO("zzoo")); // false
    }
}
