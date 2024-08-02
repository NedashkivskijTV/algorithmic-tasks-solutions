package org.example;

import org.example.model.Dinglemouse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Dinglemouse.ownedCatAndDog(15, 15))); // 1, 1
        System.out.println(Arrays.toString(Dinglemouse.ownedCatAndDog(24, 24))); // 2, 2
        System.out.println(Arrays.toString(Dinglemouse.ownedCatAndDog(28, 29))); // 3, 3
    }
}