package org.example.model;

// https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (char symbol : s.toCharArray()) {
            switch (symbol) {
                case '(':
                case '{':
                case '[': {
                    characterStack.push(symbol);
                    break;
                }
                case ')': {
                    if (characterStack.empty() || characterStack.pop() != '(') {
                        return false;
                    }
                    break;
                }
                case '}': {
                    if (characterStack.empty() || characterStack.pop() != '{') {
                        return false;
                    }
                    break;
                }
                case ']': {
                    if (characterStack.empty() || characterStack.pop() != '[') {
                        return false;
                    }
                    break;
                }
                default:
                    throw new IllegalArgumentException("Wrong symbol in the string - " + symbol);
            }
        }

        return characterStack.empty();
    }
}