package org.example.model;

// https://leetcode.com/problems/group-anagrams/

import java.util.*;

public class Solution {
    // second solution
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sortedStr = new String(strArr);

            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }



    /*
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramsList = new ArrayList<>();

        if (strs.length < 2) {
            anagramsList.add(Arrays.stream(strs).toList());
            return anagramsList;
        }

        Set<Integer> addedAnagramsIndexes =  new HashSet<>();

        for (int i = 0; i < strs.length; i++) {
            if (addedAnagramsIndexes.contains(i)) {
                continue;
            }

            List<String> stringList = new ArrayList<>(List.of(strs[i]));
            addedAnagramsIndexes.add(i);

            for (int j = i + 1; j < strs.length; j++) {
                if (!isAnagram(strs[i], strs[j])) {
                    continue;
                }

                stringList.add(strs[j]);
                addedAnagramsIndexes.add(j);
            }

            anagramsList.add(stringList);
        }

        return anagramsList;
    }

    private boolean isAnagram(String str1, String str2) {
        char[] str1Arr = str1.toCharArray();
        Arrays.sort(str1Arr);

        char[] str2Arr = str2.toCharArray();
        Arrays.sort(str2Arr);

        return Arrays.equals(str1Arr, str2Arr);
    }
*/

    }

// first solution
