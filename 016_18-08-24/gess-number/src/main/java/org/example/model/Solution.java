package org.example.model;

// https://leetcode.com/problems/guess-number-higher-or-lower/

//public class Solution extends GuessGame {
public class Solution {
    int pick;

    public Solution(int pick) {
        this.pick = pick;
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int middle = 0;

        while (right >= left) {
            middle = left + (right - left) / 2;
            int guessResult = guess(middle);
            if (guessResult == 0) {
                break;
            }
            if (guessResult == -1) {
                right = middle;
            } else if (guessResult == 1) {
                left = middle + 1;
            }
        }

        return middle;
    }

    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if num is higher than the picked number
     * 1 if num is lower than the picked number
     * otherwise return 0
     * int guess(int num);
     */
    public int guess(int num) {
        //System.out.println("Num = " + num + " pick = " + pick + " -> " + Integer.compare(pick, num));
        return Integer.compare(pick, num);
    }

}
