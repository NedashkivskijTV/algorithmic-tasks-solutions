package org.example.model;

public  class Solution {
    public boolean backspaceCompare(String s, String t) {
        String cleanS = clearString(s);
        String cleanT = clearString(t);

        return cleanS.equals(cleanT);
    }

    private String clearString(String s) {
        StringBuilder cleanStr = new StringBuilder();
        int stepOver = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            if (currentSymbol == '#') {
                ++stepOver;
                continue;
            }
            if (stepOver > 0) {
                --stepOver;
                continue;
            }
            cleanStr.insert(0, currentSymbol);
        }
        return cleanStr.toString();
    }

}
