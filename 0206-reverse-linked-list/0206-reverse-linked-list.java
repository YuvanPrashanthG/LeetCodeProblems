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
    public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        ListNode end = null;
        ListNode temp =head.next;
        ListNode newHead=new ListNode(head.val,end);
        while(temp!=null)
        {
            ListNode mover=new ListNode(temp.val,newHead);
            newHead=mover;
            temp=temp.next;
        }
        return newHead;
    }
}