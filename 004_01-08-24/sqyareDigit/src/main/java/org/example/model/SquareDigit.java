package org.example.model;

public class SquareDigit {

    public int squareDigits(int n) {
        if (n == 0) {
            return 0;
        }

        StringBuilder resultStr = new StringBuilder();
        int temp = n;

        while (temp > 0) {
            int currentDigit = temp % 10;
            int squareCurrentDigit = currentDigit * currentDigit;

            resultStr.insert(0, String.valueOf(squareCurrentDigit));

            temp = temp / 10;
        }

        return Integer.parseInt(resultStr.toString());
    }

}
