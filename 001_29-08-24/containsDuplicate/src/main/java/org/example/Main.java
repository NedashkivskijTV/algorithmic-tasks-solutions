package org.example;

import org.example.model.ContainsDuplicate;

public class Main {
    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate()
                .containsDuplicate(new int[]{1,2,3,1})); // true

        System.out.println(new ContainsDuplicate()
                .containsDuplicate(new int[]{1,2,3,4})); // false

        System.out.println(new ContainsDuplicate()
                .containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2})); // true
    }

}
