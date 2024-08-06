package org.example.model;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] arr = String.valueOf(num).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        return Integer.parseInt(String.join("", arr));
    }

}
