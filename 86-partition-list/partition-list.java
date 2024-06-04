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
    public ListNode partition(ListNode head, int x) {
       ListNode curr = head;
       ListNode lessD = new ListNode(0);
       ListNode less = lessD;
       ListNode greatD = new ListNode(0);
       ListNode great = greatD;

       while(curr!=null){
        if(curr.val <x){
            less.next = new ListNode(curr.val);
            less= less.next;
        }
        else{
            great.next = new ListNode(curr.val);
            great= great.next;
        }
        curr = curr.next;
       }
       less.next = greatD.next;
       return  lessD.next;


        
    }
}