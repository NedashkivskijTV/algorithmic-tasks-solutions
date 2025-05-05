package org.example.model;

// https://www.codewars.com/kata/56e2f59fb2ed128081001328/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrinter {

    public static String printArray(Object[] array) {
        return Arrays.stream(array)
                //.map(o -> String.valueOf(o))
                .map(String::valueOf)
                .collect(Collectors.joining(","));
    }

}


/*
return stream(array).map(Object::toString).collect(joining(","));
 */