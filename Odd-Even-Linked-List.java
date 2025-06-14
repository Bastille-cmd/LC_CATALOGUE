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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode temp1=head;
        ListNode temp2=head.next;
        ListNode head1=head.next;
        while((temp1!=null && temp1.next!=null) && (temp2!=null && temp2.next!=null)){
            temp1.next=temp1.next.next;
            temp1=temp2.next;
            temp2.next=temp2.next.next;
            temp2=temp1.next;
        }
        temp1.next=head1;
        return head;
    }
}