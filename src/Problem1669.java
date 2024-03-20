/**
 *  1669. Merge In Between Linked Lists
 *
 *  You are given two linked lists: list1 and list2 of sizes n
 *  and m respectively.
 *
 *  Remove list1's nodes from the ath node to the bth node, and
 *  put list2 in their place.
 *
 */

import datastructure.ListNode;

public class Problem1669 {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tail = list1;
        ListNode head = list1;

        for (int i=0; i < a-1; i++) {
            head = head.next;
        }

        for (int i = 0; i < b; i++) {
            tail = tail.next;
        }

        head.next = list2;

        ListNode list2Tail = list2;
        while (list2Tail.next != null) {
            list2Tail = list2Tail.next;
        }

        list2Tail.next = tail.next;

        return list1;
    }
}
