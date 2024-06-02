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
    public ListNode deleteMiddle(ListNode head) {
     ListNode temp= head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size==1){
            return null;
        }
        temp=head;
        size=size/2;
        int c=1;
        while(c!=size){
            temp=temp.next;
            c++;
        }
        temp.next=temp.next.next;
        return head;
    }
}