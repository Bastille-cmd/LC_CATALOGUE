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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=head;
        if(head==null) return null;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        int rotate=k%count;
        for(int i=1;i<count-rotate;i++){
            prev=prev.next;
            }
        for(int i=1;i<count;i++){
            temp=temp.next;
        }
        temp.next=head;
        head=prev.next;
        prev.next=null;
        return head;
    }
}