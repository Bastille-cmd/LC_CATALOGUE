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
        ListNode prev=null;
        ListNode temp=head;
        ListNode nextt=head;
        ListNode Head=null;
        while(nextt!=null && nextt.next!=null){
            ListNode node =new ListNode();
            nextt=nextt.next.next;
            prev=temp;
            temp=temp.next;
            node.val=prev.val;
            if(Head==null){
                Head=node;
            }
            else{
                node.next=Head;
                Head=node;
            }
        }
        if(nextt==null){
            while(Head!=null){
                if(Head.val!=temp.val){
                    return false;
                }
                Head=Head.next;
                temp=temp.next;
            }
            return true;
        }
        if(nextt!=null){
            temp=temp.next;
            while(Head!=null){
                if(Head.val!=temp.val){
                    return false;
                }
                Head=Head.next;
                temp=temp.next;
            }
            return true;
        }
        return true;
    }
}