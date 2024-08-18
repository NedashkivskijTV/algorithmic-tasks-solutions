package org.example.model;

// https://leetcode.com/problems/reverse-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

/*
        // iteratively
        ListNode newHead = new ListNode(head.val);
        ListNode currentNode = head.next;
        while (currentNode != null) {
            newHead = new ListNode(currentNode.val, newHead);
            currentNode = currentNode.next;
        }
*/

        // recursively
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void printList(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.val);
            if (currentNode.next !=  null) {
                System.out.print("->");
            }
            currentNode = currentNode.next;
        }
    }

}