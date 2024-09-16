package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(1)); // A
        System.out.println(new Solution().convertToTitle(2)); // B
        System.out.println(new Solution().convertToTitle(3)); // C
        System.out.println(new Solution().convertToTitle(26)); // Z
        System.out.println(new Solution().convertToTitle(27)); // AA
        System.out.println(new Solution().convertToTitle(28)); // AB
        System.out.println(new Solution().convertToTitle(52)); // ZZ

        System.out.println(new Solution().convertToTitle(701)); // ZY
        System.out.println(new Solution().convertToTitle(2147483647)); // FXSHRXW
    }

}
