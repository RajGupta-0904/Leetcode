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
        Stack<Integer> ll1 = new Stack<>();
        Stack<Integer> ll2 = new Stack<>();
        int carry=0;
        int sum=0;
        ListNode head=null;
        for(ListNode i=l1;i!=null;i=i.next){
            ll1.push(i.val);
        }
        for(ListNode i=l2;i!=null;i=i.next){
            ll2.push(i.val);
        }
        while(ll1.size()!=0 || ll2.size()!=0 || carry!=0){
            sum=carry;
            if(ll1.size()!=0){
                sum+=ll1.pop();
            }
            if(ll2.size()!=0){
                sum+=ll2.pop();
            }
            ListNode ans=new ListNode (sum%10);
            ans.next=head;
            head=ans;
            carry=sum/10;
        }
        return head;
    }
}