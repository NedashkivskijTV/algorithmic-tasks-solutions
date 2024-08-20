package org.example;

import org.example.model.ListNode;
import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        // 1,2,2,1
        ListNode head_1 = new ListNode(1);
        head_1 = new ListNode(2, head_1);
        head_1 = new ListNode(2, head_1);
        head_1 = new ListNode(1, head_1);
        printListNode(head_1);
        System.out.println("\n" + new Solution().isPalindrome(head_1)); // true

        // 1,2
        System.out.println();
        ListNode head_2 = new ListNode(2);
        head_2 = new ListNode(1, head_2);
        printListNode(head_2);
        System.out.println("\n" + new Solution().isPalindrome(head_2)); // false

    }

    private static void printListNode(ListNode head) {
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