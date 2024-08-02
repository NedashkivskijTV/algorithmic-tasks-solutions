package org.example;

import org.example.model.IsAnagram;

public class Main {
    public static void main(String[] args) {
        System.out.println(new IsAnagram().isAnagram("anagram", "nagaram")); // true
        System.out.println(new IsAnagram().isAnagram("rat", "car")); // false
        System.out.println(new IsAnagram().isAnagram("aa", "a")); // false
    }
}