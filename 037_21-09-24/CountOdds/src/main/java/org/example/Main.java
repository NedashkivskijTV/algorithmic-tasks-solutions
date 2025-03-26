package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().countOdds(3, 7)); // 3
        System.out.println(new Solution().countOdds(8, 10)); // 1
        System.out.println(new Solution().countOdds(14, 17)); // 2
        System.out.println(new Solution().countOdds(143236945, 336864988)); //96814022
    }
}