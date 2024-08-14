package org.example.model;

// https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.length() == 0) {
			return null;
		}

		return Arrays.stream(phrase.split(" "))
				.map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1))
				.collect(Collectors.joining(" "));
	}

}


// second solution
/*
		if (phrase == null || phrase.length() == 0) {
			return null;
		}

		String[] phraseArr = phrase.split(" ");

		for (int i = 0; i < phraseArr.length; i++) {
			String word = phraseArr[i];
			phraseArr[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
		}

		return String.join(" ", phraseArr);

 */

// first solution
/*
		if (phrase == null || phrase.length() == 0) {
			return null;
		}

		String[] phraseArr = phrase.split(" ");

		StringBuilder result = new StringBuilder();

		for (String word : phraseArr) {
			char firstLatter = Character.toUpperCase(word.charAt(0));
			String jadenWord = firstLatter + word.substring(1);
			result.append(jadenWord).append(" ");
		}

		return result.toString().trim();
 */