class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0)return head;
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        k = k % size;
        if(k==0)return head;
        ListNode newTail = head;
        for(int i = 0 ; i < size - k - 1 ;i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        temp = newHead;
        while(temp.next != null){  
            temp = temp.next;
        }
        temp.next = head;

        return newHead;

    }
}
