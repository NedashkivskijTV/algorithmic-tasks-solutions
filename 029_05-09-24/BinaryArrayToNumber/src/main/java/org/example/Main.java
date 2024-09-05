package org.example;

import org.example.model.BinaryArrayToNumber;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(List.of(0, 0, 0, 1))); // 1
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(List.of(0, 0, 1, 0))); // 2
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(List.of(0, 1, 0, 0))); // 4
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(List.of(0, 1, 1, 0))); // 6
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(List.of(1, 0, 0, 1))); // 9
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(List.of(1, 1, 1, 1))); // 15
    }
}