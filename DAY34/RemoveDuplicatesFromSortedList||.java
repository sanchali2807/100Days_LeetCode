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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next == null)return head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        ListNode curr = head;
        while(curr!=null){
            if(curr.next !=null && curr.val == curr.next.val){
                int value = curr.val;
                while(curr!=null && curr.val == value){
                    curr = curr.next;
                }
                prev.next = curr;
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return temp.next;
    }
}
