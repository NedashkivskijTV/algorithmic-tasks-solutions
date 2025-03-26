package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(
                new String[]{"flower","flow","flight"}
        )); // fl

        System.out.println(new Solution().longestCommonPrefix(
                new String[]{"dog","racecar","car"}
        )); // ""

    }
}