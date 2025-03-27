package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Solution().titleToNumber("A")); //1

        System.out.println(new Solution().titleToNumber("AB")); // 28

        System.out.println(new Solution().titleToNumber("ZY")); // 701
    }
}