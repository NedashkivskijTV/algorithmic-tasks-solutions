package org.example.model;

// https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        // first solution
//        List<String> resultList = new ArrayList<>();
//        for (int i = 0; i < lines.size(); i++) {
//            String currentLine = lines.get(i);
//            resultList.add((i + 1) + ": " + currentLine);
//        }
//
//        return resultList;


        // second solution
        return IntStream.range(0, lines.size())
                .mapToObj(i -> (i + 1) + ": " + lines.get(i))
                .collect(Collectors.toList());
    }
}