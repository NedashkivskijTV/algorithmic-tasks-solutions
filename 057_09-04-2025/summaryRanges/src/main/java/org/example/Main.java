package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution()
                .summaryRanges(new int[]{0, 1, 2, 4, 5, 7})); // ["0->2","4->5","7"]

        System.out.println(new Solution()
                .summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9})); // ["0","2->4","6","8->9"]
    }

}
