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
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null||head.next==null||k==0)
        {
            return head;
        }
        ListNode first = head;
        for (int i =1;i<k;i++)
        {
            first = first.next;
        }
        ListNode temp = first;
        ListNode second = head;
        while (temp.next!=null)
        {
            temp=temp.next;
            second = second.next;
        }
        int t = second.val;
        second.val=first.val;
        first.val=t;
        return head;
    }
}