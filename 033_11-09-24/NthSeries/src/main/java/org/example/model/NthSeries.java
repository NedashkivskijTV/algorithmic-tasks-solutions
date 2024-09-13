package org.example.model;

// https://www.codewars.com/kata/555eded1ad94b00403000071/train/java

public class NthSeries {
	
	public static String seriesSum(int n) {
		int oneNumber = 1;
		int denominator = 1;
		float resultFloat = 0.00f;
		for (int i = 1; i <= n; i++) {
			resultFloat += 1f * oneNumber / denominator;
			denominator += 3;
		}
		float resultNumber = (float) (0.01 * Math.round(resultFloat * 100));

		return String.format("%.2f", resultNumber);
	}

}
