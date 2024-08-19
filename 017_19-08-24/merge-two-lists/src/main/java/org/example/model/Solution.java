package org.example.model;

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2 == null) {
            return list1;
        }
        if (list1 == null) {
            return list2;
        }

        ListNode currentList_1 = list1;
        ListNode currentList_2 = list2;
        ListNode resultListHead = null;
        ListNode currentResultList = null;

        while (currentList_1 != null && currentList_2 != null) {
            ListNode newNode;
            if (resultListHead == null) {
                if (currentList_1.val < currentList_2.val) {
                    newNode = new ListNode(currentList_1.val);
                    currentList_1 = currentList_1.next;
                } else {
                    newNode = new ListNode(currentList_2.val);
                    currentList_2 = currentList_2.next;
                }
                resultListHead = newNode;
                currentResultList = newNode;
                continue;
            }

            if (currentList_1.val < currentList_2.val) {
                newNode = new ListNode(currentList_1.val);
                currentResultList.next = newNode;
                currentResultList = currentResultList.next;
                currentList_1 = currentList_1.next;
            } else {
                newNode = new ListNode(currentList_2.val);
                currentResultList.next = newNode;
                currentResultList = currentResultList.next;
                currentList_2 = currentList_2.next;
            }
        }

        if (currentList_1 != null) {
            currentResultList.next = currentList_1;
        }
        if (currentList_2 != null) {
            currentResultList.next = currentList_2;
        }

        return resultListHead;
    }

    public class ListNode {
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
            if (currentNode.next != null) {
                System.out.print(" -> ");
            }
            currentNode = currentNode.next;
        }
    }

}