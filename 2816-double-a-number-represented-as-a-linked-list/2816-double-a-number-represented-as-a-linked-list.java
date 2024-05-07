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
    public ListNode doubleIt(ListNode head) {
        head = new ListNode(0,head);
        head = reverse(head);
        ListNode add = head;
        int c = 0;
        int carryCheck = 0;
        while(head !=null){
            int temp = head.val*2;
            head.val = c+temp%10;
            carryCheck = head.val;
            c = temp/10;
            head = head.next;
        }
        add = reverse(add);
        return (carryCheck==1)?add:add.next;
    }
    public ListNode reverse(ListNode head){
        ListNode p = null;
        ListNode c = head;
        while(c!=null){
            ListNode temp = c.next;
            c.next = p ;
            p = c ;
            c = temp;
        }
        return p;
    }
}