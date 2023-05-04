class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next!=null){
            if(current.val == current.next.val)
                current.next = current.next.next;
            if(current.next!=null && current.val != current.next.val)
                current = current.next;
        }
        return head;
    }
}
