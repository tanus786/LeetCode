class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode node1 = null;
        ListNode node2 = head;
        ListNode node3 = head.next;
        while(node2!=null){
            node2.next = node1;
            node1 = node2;
            node2 = node3;
            if(node3 != null)
                node3 = node3.next;
        }
        head = node1;
        return head;
    }
}
