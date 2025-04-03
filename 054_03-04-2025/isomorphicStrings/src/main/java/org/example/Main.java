package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("egg", "add")); // true
        System.out.println(new Solution().isIsomorphic("fee", "bar")); // false
        System.out.println(new Solution().isIsomorphic("paper", "title")); // true
        System.out.println(new Solution().isIsomorphic("badc", "baba")); // false
    }
}
