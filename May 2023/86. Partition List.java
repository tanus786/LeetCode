class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode li = dummy1;
        ListNode l2 = dummy2;
        while(head!=null){
            if(head.val<x){
                li.next = head;
                li = li.next;
                head = head.next; 
                
            }
            else{
                l2.next = head;
                l2 = l2.next;
                head = head.next;
                
            }
        }
        l2.next = null;
        li.next = dummy2.next;
        return dummy1.next;
    }
}


