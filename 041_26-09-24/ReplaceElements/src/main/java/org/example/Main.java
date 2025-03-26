package org.example;

import org.example.model.Solution;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Solution().replaceElements(new int[]{17,18,5,4,6,1})
        )); // 18,6,6,6,1,-1

        System.out.println(Arrays.toString(
                new Solution().replaceElements(new int[]{400})
        )); // -1

    }
}