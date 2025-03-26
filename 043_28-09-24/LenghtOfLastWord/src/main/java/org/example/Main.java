package org.example;

import org.example.model.Solution;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution()
                .lengthOfLastWord("Hello World")); // 5
        System.out.println(new Solution()
                .lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(new Solution()
                .lengthOfLastWord("luffy is still joyboy")); // 6
    }

}
