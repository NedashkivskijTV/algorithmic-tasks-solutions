package org.example.model;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] mums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : mums) {
            if (numsSet.contains(num)) {
                return true;
            }
            numsSet.add(num);
        }
        return false;
    }

}
