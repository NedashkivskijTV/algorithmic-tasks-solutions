package org.example.model;

// https://leetcode.com/problems/baseball-game/description/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scoreList = new ArrayList<>();

        for (String operation : operations) {
            switch (operation) {
                case "+": {
                    int scoreListSize = scoreList.size();
                    int sumTwoPrevious = scoreList.get(scoreListSize - 1) + scoreList.get(scoreListSize - 2);
                    scoreList.add(sumTwoPrevious);
                    break;
                }
                case "D": {
                    int newScore = scoreList.get(scoreList.size() - 1) * 2;
                    scoreList.add(newScore);
                    break;
                }
                case "C" : {
                    scoreList.remove(scoreList.size() - 1);
                    break;
                }
                default:{
                    int currentScore = Integer.parseInt(operation);
                    scoreList.add(currentScore);
                }
            }
        }

        return scoreList.stream()
                .mapToInt(i -> i)
                .sum();
    }

}
