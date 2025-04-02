package org.example.model;

// https://www.codewars.com/kata/57e2dd0bec7d247e5600013a/train/java

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static Object[] unflatten(int[] flatArray) {
        List<Object> unflattedList = new ArrayList<>();

        for (int i = 0; i < flatArray.length; i++) {
            if (flatArray[i] < 3) {
                unflattedList.add(flatArray[i]);
            } else {
                List<Integer> sublist = new ArrayList<>();

                for (int j = 0; j < flatArray[i] && j + i < flatArray.length; j++) {
                    sublist.add(flatArray[i + j]);
                }

                i += flatArray[i] - 1;
                unflattedList.add(sublist.toArray(new Integer[0]));
            }
        }

        return unflattedList.toArray();
    }

}


/*
    final List<Object> res = new ArrayList<>();
    for (int i=0; i<fa.length; ) res.add(fa[i] < 3 ? fa[i++] : Arrays.copyOfRange(fa,i,Math.min(fa.length,i+=fa[i])));
    return res.toArray();
 */