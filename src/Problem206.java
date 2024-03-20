import datastructure.ListNode;

/**
 *  206. Reverse Linked List
 *
 *  Given the head of a singly linked list, reverse
 *  the list, and return the reversed list.
 *
 */

public class Problem206 {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;

        while (head != null) {
            ListNode tmp = new ListNode(head.val, null);
            head = head.next;

            tmp.next = newHead;
            newHead = tmp;
        }
        return newHead;
    }
}
