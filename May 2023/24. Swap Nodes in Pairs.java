class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = head;
        if(head == null|| head.next == null )
            return head;
        while(dummy!=null && dummy.next!=null){
            int temp = dummy.next.val;
            dummy.next.val = dummy.val;
            dummy.val = temp;
            dummy = dummy.next.next;
        }
            return head;
    }
}

##2nd solution


class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null|| head.next == null )
            return head;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            prev.next = curr.next;
            curr.next = prev.next.next;
            prev.next.next = curr;

            prev = curr;
            curr = curr.next;
        }
            return dummy.next;
    }
}
