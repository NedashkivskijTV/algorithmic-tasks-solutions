package org.example;

import org.example.model.Generator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Generator.nickname("Robert")); //Rob
        System.out.println(Generator.nickname("Kimberly")); // Kim
        System.out.println(Generator.nickname("Samantha")); // Sam

        System.out.println(Generator.nickname("Jeannie")); // Jean
        System.out.println(Generator.nickname("Douglas")); // Doug
        System.out.println(Generator.nickname("Gregory")); // Greg
    }

}
