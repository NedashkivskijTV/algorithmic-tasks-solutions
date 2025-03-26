package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().groupAnagrams(new String[]{
                "eat", "tea", "tan", "ate", "nat", "bat"
        })); // [["bat"],["nat","tan"],["ate","eat","tea"]]

        System.out.println(new Solution().groupAnagrams(new String[]{""})); // [[""]]

        System.out.println(new Solution().groupAnagrams(new String[]{"a"})); // [["a"]]
    }
}
