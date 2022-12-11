class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right || head.next == null)
            return head;
        int c = left;
        ListNode node = head;
        for(int i = 1;i<left;i++){
            node = node.next;
        }
        ListNode node1 = null;
        ListNode node2 = node;
        ListNode node3 = node.next;
        while(left<=right){
            left++;
            node2.next = node1;
            node1 = node2;
            node2=node3;
            if(node3!=null)
                node3 = node3.next;
        }
        if(c-1<=0){
            head = null;
            ListNode N = node1;
        while(node1 != null){
            node1 = node.next;
        }
        node.next = node2;
        return N;
        }
        else{
            ListNode t = head;
        for(int i =1;i<c-1;i++){
            System.out.println(t.val);
            t = t.next;
        }
        ListNode N = node1;
        while(node1 != null){
            node1 = node.next;
        }
        node.next = node2;
        t.next = N;
        }
        return head;
    }
}






//Solution 2





class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    if(head == null) return null;
    ListNode dummy = new ListNode(0); 
    dummy.next = head;
    ListNode pre = dummy; 
    for(int i = 0; i<m-1; i++) pre = pre.next;
    
    ListNode start = pre.next; 
    ListNode then = start.next;
    
    for(int i=0; i<n-m; i++)
    {
        start.next = then.next;
        then.next = pre.next;
        pre.next = then;
        then = start.next;
    }
    return dummy.next;
    
}

}
