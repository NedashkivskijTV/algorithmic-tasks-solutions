package org.example;

import org.example.model.MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);

        int param_2 = obj.top();
        int param_3 = obj.pop();
        boolean param_4 = obj.empty();

        System.out.println("param_2 = " + param_2); // 3
        System.out.println("param_3 = " + param_3); // 3
        System.out.println("param_4 = " + param_4); // false
    }
}