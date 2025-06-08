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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        ListNode prev1=null;
        if(head.next==null) return true;
        ListNode head1=new ListNode(head.val);
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            ListNode node =new ListNode();
            node.val=slow.val;
            node.next=head1;
            prev1=head1;
            head1=node;
        }
        head1=prev1;
        if(fast!=null){
            slow=slow.next;
        }
        while(slow!=null){
            if(head1.val!=slow.val){
                return false;
            }
            head1=head1.next;
            slow=slow.next;
        }
        return true;
    }
}