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
        if(head==null)
        return head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode previous=null;
        while(fast!=null && fast.next!=null){
            previous=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(previous==null){
            head=head.next;
        }
        else{
            previous.next=slow.next;
        }
        return head;
    }
}