class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        int size=0;
        ListNode node = head;
        while(node != null){
            size++;
            node = node.next;
        }
        if(size == n){
            head = head.next;
            return head;
        }
        node = head;
        for(int i = 1;i<size-n;i++){
            node = node.next;
        }
        if(node.next.next == null){
            node.next = null;
        }
        else{
            node.next = node.next.next;
        }
        return head;
    }
}
