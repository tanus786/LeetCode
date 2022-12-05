class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        int pos=0;
        // Base Case
        if(head.next == null) {
            head = null;
            return head;
        }
        if(head.next.next == null ){
            head.next = null;
            return head;        
        }
        // To find the middle index
        while (fast != null && fast.next != null) {
            pos++;
            fast = fast.next.next;
        }
        ListNode prev = head;
        for(int i =0;i<pos-1;i++){
            prev = prev.next;
        }
        if(prev.next.next != null){
            prev.next = prev.next.next;
        }
        else
            prev.next = null;
        
        return head;
    }
}
