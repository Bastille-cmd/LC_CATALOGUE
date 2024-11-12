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
        ListNode odd=head;
        ListNode even=head.next;
        ListNode pointer=even;
        while(odd.next!=null && odd.next.next!=null){
            odd.next=odd.next.next;
            odd=even.next;
            even.next=even.next.next;
            even=odd.next;
        }
        odd.next=pointer;
        return head;
    }
}