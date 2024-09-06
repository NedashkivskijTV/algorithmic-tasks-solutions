package org.example;

import org.example.model.Metro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});
        System.out.println(Metro.countPassengers(list)); // 5
    }
}