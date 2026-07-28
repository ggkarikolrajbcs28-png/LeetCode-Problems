/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        // Split the list into two halves
        ListNode middle = getMiddle(head);
        ListNode secondHalf = middle.next;
        middle.next = null;

        // Sort both halves
        ListNode leftPart = sortList(head);
        ListNode rightPart = sortList(secondHalf);

        // Merge the sorted halves
        return mergeLists(leftPart, rightPart);
    }

    // Finds the middle node
    private ListNode getMiddle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merges two sorted linked lists
    private ListNode mergeLists(ListNode first, ListNode second) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (first != null && second != null) {

            if (first.val <= second.val) {
                current.next = first;
                first = first.next;
            } else {
                current.next = second;
                second = second.next;
            }

            current = current.next;
        }

        if (first != null) {
            current.next = first;
        } else {
            current.next = second;
        }

        return dummy.next;
    }
}

                            
