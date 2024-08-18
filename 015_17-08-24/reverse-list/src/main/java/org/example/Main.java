package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 1,2,3,4,5
        Solution.ListNode head_1 = new Solution.ListNode(5);
        head_1 = new Solution.ListNode(4, head_1);
        head_1 = new Solution.ListNode(3, head_1);
        head_1 = new Solution.ListNode(2, head_1);
        head_1 = new Solution.ListNode(1, head_1);

        solution.printList(head_1);
        System.out.println();
        solution.printList(solution.reverseList(head_1));


        // 1,2
        System.out.println("\n" + "-".repeat(14));
        Solution.ListNode head_2 = new Solution.ListNode(2);
        head_2 = new Solution.ListNode(1, head_2);

        solution.printList(head_2);
        System.out.println();
        solution.printList(solution.reverseList(head_2));


        // null
        System.out.println("\n" + "-".repeat(14));
        Solution.ListNode head_3 = null;

        solution.printList(head_3);
        System.out.println();
        solution.printList(solution.reverseList(head_3));
    }

}
