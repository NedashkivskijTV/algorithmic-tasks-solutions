package org.example.model;

// https://leetcode.com/problems/last-stone-weight/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> stonesList = new ArrayList<>(Arrays.stream(stones)
                .sorted()
                .boxed()
                .toList());

        while (stonesList.size() > 1) {
            int x = Math.min(stonesList.get(stonesList.size() - 1), stonesList.get(stonesList.size() - 2));
            int y = Math.max(stonesList.get(stonesList.size() - 1), stonesList.get(stonesList.size() - 2));

            stonesList.remove(stonesList.size() - 1);
            stonesList.remove(stonesList.size() - 1);

            if (x != y) {
                stonesList.add(y - x);
                stonesList.sort(Comparator.naturalOrder());
            }
        }


        return stonesList.size() == 0 ? 0 : stonesList.get(0);
    }
}