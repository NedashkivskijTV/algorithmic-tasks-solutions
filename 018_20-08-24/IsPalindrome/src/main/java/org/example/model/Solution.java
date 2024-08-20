package org.example.model;

// https://leetcode.com/problems/palindrome-linked-list/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> valuesList = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            valuesList.add(currentNode.val);
            currentNode = currentNode.next;
        }

        for (int i = 0; i < valuesList.size() / 2; i++) {
            if (!Objects.equals(valuesList.get(i), valuesList.get(valuesList.size() - 1 - i))) {
                return false;
            }
        }

        return true;
    }

}
