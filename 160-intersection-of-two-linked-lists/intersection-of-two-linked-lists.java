/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // without the use length
        ListNode k = headA;
        ListNode p = headB;
        while(k!=p){
            if(k==null){
                k = headB;
            }
            else{
                k = k.next;
            }
            if(p==null){
                p = headA;
            }
            else{
                p = p.next;
            }
        }
        return p;

    }
}