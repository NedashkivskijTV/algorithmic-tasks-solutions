package org.example.model;

// https://leetcode.com/problems/find-the-town-judge/

public class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] peopleWhoTrustEveryone = new int[n + 1];
        int[] peopleWhomEveryoneTrusts = new int[n + 1];

        for (int[] peopleTrustArr : trust) {
            int currentPersonIndex = peopleTrustArr[0];
            int currentPersonTrustIndex = peopleTrustArr[1];

            peopleWhoTrustEveryone[currentPersonTrustIndex]++;
            peopleWhomEveryoneTrusts[currentPersonIndex]++;
        }

        for (int i = 1; i <= n ; i++) {
            if (peopleWhoTrustEveryone[i] == n - 1 && peopleWhomEveryoneTrusts[i] == 0) {
                return i;
            }
        }

        return  -1;
    }

}
