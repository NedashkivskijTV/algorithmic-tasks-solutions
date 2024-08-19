package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        // 1,2,4 - 1,3,4
        Solution solution = new Solution();
        Solution.ListNode listNode_1 = solution.new ListNode(4);
//        listNode_1 = solution.new ListNode(2, listNode_1);
//        listNode_1 = solution.new ListNode(1, listNode_1);
//        solution.printList(listNode_1);
//
        Solution.ListNode listNode_2 = solution.new ListNode(4);
//        listNode_2 = solution.new ListNode(3, listNode_2);
//        listNode_2 = solution.new ListNode(1, listNode_2);
//        System.out.println();
//        solution.printList(listNode_2);
//
//        System.out.println("\n");
//        solution.printList(solution.mergeTwoLists(listNode_1, listNode_2)); // 1,1,2,3,4,4

        // 2 - 1
        listNode_1 = solution.new ListNode(2);
        solution.printList(listNode_1);

        listNode_2 = solution.new ListNode(1);
        System.out.println();
        solution.printList(listNode_2);

        System.out.println("\n");
        solution.printList(solution.mergeTwoLists(listNode_1, listNode_2)); // 1,1,2,3,4,4
    }
}