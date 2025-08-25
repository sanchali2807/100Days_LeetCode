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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode agla = null;
        while(curr!=null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;

    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        ListNode temp = head;
        ListNode temp1 = reverse(slow.next);
        slow.next = null;
        ListNode l1 = head;
        ListNode l2 = temp1;
        while(l2!=null){
            ListNode first = l1.next;
            ListNode end = l2.next;
            l1.next = l2;
            l2.next = first;
            l1 = first;
            l2 = end;
        }



    }
}
