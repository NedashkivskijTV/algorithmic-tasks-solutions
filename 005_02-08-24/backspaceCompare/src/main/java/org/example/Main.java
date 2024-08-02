package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().backspaceCompare("ab#c", "ad#c")); // true
        System.out.println(new Solution().backspaceCompare("ab##", "c#d#")); // true
        System.out.println(new Solution().backspaceCompare("a#c", "b")); // false
    }
}