package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().arrayStringsAreEqual(
                new String[]{"ab", "c"},
                new String[]{"a", "bc"}) // true
        );

        System.out.println(new Solution().arrayStringsAreEqual(
                new String[]{"a", "cb"},
                new String[]{"ab", "c"}) // false
        );

        System.out.println(new Solution().arrayStringsAreEqual(
                new String[]{"abc", "d", "defg"},
                new String[]{"abcddefg"}) // true
        );
    }

}
