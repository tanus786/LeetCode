class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode node = head.next,p,dummy= new ListNode(0);
        p = dummy;
        int sum =0;
        while(node!=null){
            if(node.val!=0){
                sum = sum + node.val;
                node = node.next;
            }
            else{
            p.next = new ListNode(sum);
            p = p.next;
            sum =0;
            node = node.next;
            }
        }
        return dummy.next;
    }
}
