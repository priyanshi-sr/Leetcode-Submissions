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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         
    ListNode temp = new ListNode(0); //yaha hmne value daali hai temp mai
    ListNode head = temp;
    int carry = 0;

    while(l1 != null || l2 != null){
        if(l1 != null){
            carry = carry + l1.val;            //carry=0+2=2
            l1=l1.next;
        }
        if(l2 != null){
            carry = carry + l2.val;           //carry=2+5=7
            l2=l2.next;
        }
        temp.next=new ListNode(carry % 10);   //7%10=7 ; 10%10=0               //(yaha hum value daal re h temp.next mai)    
        temp = temp.next;
        carry = carry/10;                     //7/10=0 ; 10/10=1
    }
    if(carry == 1){                           //carry==2 ya 3... bhi toh ho skta h...han ho skta hai but constraints mai btya h ki node ki value single digits mai hi rahegi...toh usse carry 1 hi aayga 2 ya 3 ya kuch aur nhi.
        temp.next = new ListNode(1);
    }
    return head.next;
  }
    }

