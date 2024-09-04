package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz")); // true
        System.out.println(new Solution().isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz")); //  false
        System.out.println(new Solution().isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz")); // false
        System.out.println(new Solution().isAlienSorted(new String[]{"kuvp", "q"}, "ngxlkthsjuoqcpavbfdermiywz")); // true
    }
}