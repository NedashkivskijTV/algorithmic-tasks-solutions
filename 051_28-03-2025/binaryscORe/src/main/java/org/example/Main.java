package org.example;

import org.example.model.BinaryScore;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(BinaryScore.score(new BigInteger("0")));
        System.out.println(BinaryScore.score(new BigInteger("1")));
        System.out.println(BinaryScore.score(new BigInteger("49")));
        System.out.println(BinaryScore.score(new BigInteger("1000000")));
    }
}
