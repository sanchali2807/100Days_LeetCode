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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode s = new ListNode();
        ListNode temp = s;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                ListNode merge = new ListNode(temp1.val);
                temp.next = merge;
                temp1=temp1.next;
            }else{
                 ListNode merge = new ListNode(temp2.val);
                temp.next = merge;
                temp2=temp2.next;
            }
        temp=temp.next;
        }
        // while(temp1 != null){
        //     ListNode merge = new ListNode(temp1.val);
        //     temp.next = merge;
        //     temp1=temp1.next;
        //     temp=temp.next;
        // }
        //  while(temp2 != null){
        //     ListNode merge = new ListNode(temp2.val);
        //     temp.next = merge;
        //     temp2=temp2.next;
        //     temp=temp.next;
        // }
        if(temp1!=null){
            temp.next = temp1;
        }
        if(temp2!=null){
            temp.next = temp2;
        }
        
        return s.next;
    }
}
