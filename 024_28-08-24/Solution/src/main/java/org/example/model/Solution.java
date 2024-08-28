package org.example.model;

// https://leetcode.com/problems/k-closest-points-to-origin/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[][] kClosest(int[][] points, int k) {
        List<int[]> collect = Arrays.stream(points)
                .sorted((p1, p2) -> ((distances(p1) - distances(p2))))
                .limit(k)
                .toList();

        int[][] resultArr = new int[collect.size()][2];

        for (int i = 0; i < collect.size(); i++) {
            resultArr[i] = collect.get(i);
        }

        return resultArr;
    }

    private int distances(int[] point1) {
        return (point1[0] * point1[0]) + (point1[1] * point1[1]);
    }

}