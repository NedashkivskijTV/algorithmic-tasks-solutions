package org.example;

import org.example.model.Order;

public class Main {
    public static void main(String[] args) {
        System.out.println(Order
                .order("is2 Thi1s T4est 3a")); // Thi1s is2 3a T4est
        System.out.println(Order
                .order("4of Fo1r pe6ople g3ood th5e the2")); // Fo1r the2 g3ood 4of th5e pe6ople
        System.out.println(Order
                .order("")); // ""
    }
}