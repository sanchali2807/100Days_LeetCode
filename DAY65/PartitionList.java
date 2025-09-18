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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode before = new ListNode(0);
        ListNode beforePtr = before;
        ListNode after = new ListNode(0);
        ListNode afterPtr = after;
        while(temp!=null){
            if(temp.val < x){
                beforePtr.next = new ListNode(temp.val);
                beforePtr = beforePtr.next;
            }else{
                afterPtr.next = new ListNode(temp.val);
                afterPtr = afterPtr.next;
            }
            temp = temp.next;
        }
        beforePtr.next = after.next;
        return before.next;
    }
}
