package org.example;

import org.example.model.Hello;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Hello().sayHello(
                new String[] {"John", "Smith"}, "Phoenix", "Arizona"
        )); // Hello, John Smith! Welcome to Phoenix, Arizona!
    }

}
