package org.example.model;

// https://www.codewars.com/kata/5cb7baa989b1c50014a53333

import java.util.Arrays;

public class Kata {

    public static Boolean isSatorSquare(char[][] tablet) {
        // second solution
        int tabletLength = tablet.length;
        for (int i = 0; i < tabletLength; i++) {
            for (int j = 0; j < tabletLength; j++) {
                if (tablet[i][j] != tablet[j][i]
                        || tablet[i][j] != tablet[tabletLength - 1 - i][tabletLength - 1 - j]
                        || tablet[i][j] != tablet[tabletLength - 1 - j][tabletLength - 1 - i]) {
                    return false;
                }
            }
        }
        return true;


        // first solution
/*        int tabletLength = tablet.length;
        for (int i = 0; i < tabletLength; i++) {
            char[] horizontalWord = tablet[i];

            char[] verticalWord = new char[tabletLength];
            for (int j = 0; j < tabletLength; j++) {
                verticalWord[j] = tablet[j][i];
            }

            char[] horizontalReversEndWord = new char[tabletLength];
            for (int j = 0; j < tabletLength; j++) {
                horizontalReversEndWord[horizontalReversEndWord.length - 1 - j] = tablet[tabletLength - 1 - i][j];
            }

            char[] verticalReversEndWord = new char[tabletLength];
            for (int j = 0; j < tabletLength; j++) {
                verticalReversEndWord[verticalReversEndWord.length - 1 - j] = tablet[j][tabletLength - 1 - i];
            }

            if (!Arrays.equals(horizontalWord, verticalWord)
                    || !Arrays.equals(horizontalWord, horizontalReversEndWord)
                    || !Arrays.equals(horizontalWord, verticalReversEndWord)) {
                return false;
            }
        }
        return true;*/
    }
}
