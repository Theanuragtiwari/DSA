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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a = head;
        ListNode b = head;
        int counter = 0; 

        while (b.next != null) {
            if (counter >= n) {
                a = a.next;
            }
            b = b.next;
            counter++;
        }
        if (counter < n) {
            head = a.next;
        } else {
             a.next = a.next.next;
        }
        return head;
    }
}