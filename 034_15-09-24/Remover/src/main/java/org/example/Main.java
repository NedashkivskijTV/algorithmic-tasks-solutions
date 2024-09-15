package org.example;

import org.example.model.Remover;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Remover.removeSmallest(new int[]{1,2,3,4,5}))); // 2,3,4,5
        System.out.println(Arrays.toString(Remover.removeSmallest(new int[]{5,3,2,1,4}))); // 5,3,2,4
        System.out.println(Arrays.toString(Remover.removeSmallest(new int[]{2,2,1,2,1}))); // 2,2,2,1
    }
}