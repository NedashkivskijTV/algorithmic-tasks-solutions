package org.example.model;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gIndex = 0;
        int sIndex = 0;

        while (gIndex < g.length && sIndex < s.length) {
            if (s[sIndex] >= g[gIndex]) {
                ++gIndex;
            }
            ++sIndex;
        }

        return gIndex;
    }
}

/*
// long algorithm - 82ms
        int childrenCounter = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for (int childGreedFactor : g) {
            for (int i = 0; i < s.length; i++) {
                if (s[i] >= childGreedFactor) {
                    childrenCounter++;
                    s[i] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        return childrenCounter;
 */