package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution()
                .calPoints(new String[]{"5","2","C","D","+"})); // 30
        System.out.println(new Solution()
                .calPoints(new String[]{"5","-2","4","C","D","9","+","+"})); // 27
        System.out.println(new Solution()
                .calPoints(new String[]{"1","C"})); // 0
    }

}
