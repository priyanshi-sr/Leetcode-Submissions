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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode previous = dummy;
        while(previous.next != null && previous.next.next != null){
            ListNode slow = previous.next;
            ListNode fast = previous.next.next;

            slow.next = fast.next;
            fast.next = slow;
            previous.next  =  fast ;
            previous = slow;
        }

        
    return dummy.next;
    }
}