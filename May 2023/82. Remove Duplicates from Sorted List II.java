class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode li = dummy;
        while(head != null && head.next != null){
            if(head.val != head.next.val){
                li.next = head;
                li = li.next;
            }
            else{
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
            }
            head = head.next;
        }
        li.next = head;
        return dummy.next;
    }
}
