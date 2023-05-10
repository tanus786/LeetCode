class MyHashSet {
    ListNode dummy=new ListNode(-1);
    public MyHashSet() { 
    }
    
    public void add(int key) {
        ListNode NewNode = new ListNode(key);
        NewNode.next = dummy.next;
        dummy.next = NewNode;
    }
    
    public void remove(int key) {
        ListNode curr = dummy;
        while(curr.next!=null){
            if(curr.next.val == key){
                curr.next = curr.next.next;
            }
            else
                curr = curr.next;
        }
    }
    
    public boolean contains(int key) {
        ListNode curr = dummy.next;
        while(curr!=null){
            if(curr.val == key) return true;
            else curr = curr.next;
        }
        return false;
    }
}
