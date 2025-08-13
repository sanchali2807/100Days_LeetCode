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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode t1 = dummy;
        for(int value : list){
            t1.next = new ListNode(value);
            t1 = t1.next;
        }
        return dummy.next;
    }
}
