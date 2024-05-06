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
    public ListNode removeNodes(ListNode head) {
        head=reverseList(head);
        ListNode temp=head;
        while(head!=null &&head.next!=null){
            if(head.next.val>=head.val){
                head=head.next;
            }else{
                head.next=head.next.next;
            }
            
        }
        temp=reverseList(temp);
        return temp;
    }
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode  prev =null;
        while(curr!=null){
            ListNode ahead= curr.next;
            curr.next=prev;
            prev= curr;
            curr =ahead;
        }
        return prev;

    }
}