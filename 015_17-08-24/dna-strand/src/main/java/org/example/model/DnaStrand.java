package org.example.model;

// https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java

public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder result = new StringBuilder();
        for (char c : dna.toCharArray()) {
            switch (c) {
                case 'A' -> result.append('T');
                case 'T' -> result.append('A');
                case 'C' -> result.append('G');
                case 'G' -> result.append('C');
                default -> result.append(c);
            }
        }
        return result.toString();
    }

}
