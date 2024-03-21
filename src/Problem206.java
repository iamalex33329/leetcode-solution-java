/**
 *  206. Reverse Linked List
 *
 *  Given the head of a singly linked list, reverse
 *  the list, and return the reversed list.
 *
 */

import datastructure.ListNode;

public class Problem206 {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;

        while (head != null) {
            ListNode tmp = new ListNode(head.val, null);
            tmp.next = newHead;
            newHead = tmp;

            head = head.next;
        }
        return newHead;
    }
}
