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
        ListNode head=null;
        ListNode temp=null;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int data=(l1==null)?0:l1.val;
            int data1=(l2==null)?0:l2.val;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            if(head==null){
                ListNode node =new ListNode();
                if(data+data1>9) carry=1;
                node.val=(data+data1)%10;
                head=node;
                temp=head;
            }
            else{
                ListNode node =new ListNode();
                node.val=(data+data1+carry)%10;
                temp.next=node;
                temp=node;
                if(data+data1+carry>9) carry=1;
                else carry=0;
                }
            }
            return head;
        }
    }