public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while(slow!=null && fast!= null && fast.next!=null){
            if(fast == slow)
                return true;
            else{
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        return false;
    }
}
