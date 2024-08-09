package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()")); // true
        System.out.println(new Solution().isValid("()[]{}")); // true
        System.out.println(new Solution().isValid("(]")); // false
    }

}
