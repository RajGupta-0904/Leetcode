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
        ListNode A = new ListNode();
        ListNode B =new ListNode();
        ListNode a=A;
        ListNode b=B;
        ListNode temp =head;
        while(temp!=null){
            if(temp.val <x){
                a.next=temp;
                a=a.next;
            }
            else{
                b.next=temp;
                b=b.next;
                
            }
            temp=temp.next;
            
        }
        
            a.next=B.next;
            b.next=null;
        return A.next;
     }
}