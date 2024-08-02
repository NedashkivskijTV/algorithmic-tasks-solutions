package org.example.model;

import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
