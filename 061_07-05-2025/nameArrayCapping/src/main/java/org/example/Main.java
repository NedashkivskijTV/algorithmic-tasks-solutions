package org.example;

import org.example.model.Kata;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                Kata.capMe(new String[]{"jo", "nelson", "jurie"})
        )); // ["Jo", "Nelson", "Jurie"]

        System.out.println(Arrays.toString(
                Kata.capMe(new String[0])
        )); // []

        System.out.println(Arrays.toString(
                Kata.capMe(new String[] {"", "", ""})
        )); // []

    }

}
