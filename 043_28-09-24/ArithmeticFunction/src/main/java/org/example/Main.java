package org.example;

import org.example.model.ArithmeticFunction;

public class Main {
    public static void main(String[] args) {
        System.out.println(ArithmeticFunction.arithmetic(5, 2, "add")); // 7
        System.out.println(ArithmeticFunction.arithmetic(5, 2, "subtract")); // 3
        System.out.println(ArithmeticFunction.arithmetic(5, 2, "multiply")); // 10
        System.out.println(ArithmeticFunction.arithmetic(5, 2, "divide")); // 2
        System.out.println(ArithmeticFunction.arithmetic(8, 4, "divide")); // 2
    }

}
