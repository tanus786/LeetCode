class MyHashMap {
    ListNode dummy1 = new ListNode(-1);
    ListNode dummy2 = new ListNode(-1);
    public MyHashMap() {
    }
    
    public void put(int key, int value) {
        ListNode curr1 = dummy1;
        ListNode curr2 = dummy2;
        while(curr1.next != null){
            if(curr1.next.val == key){
                curr2.next.val = value;
                return;
            }
            else{
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            
        }
        ListNode new1 = new ListNode(key);
        new1.next = dummy1.next;
        dummy1.next = new1;
        ListNode new2 = new ListNode(value);
        new2.next = dummy2.next;
        dummy2.next = new2;

    }
    
    public int get(int key) {
        ListNode curr1 = dummy1.next;
        ListNode curr2 = dummy2.next;
        while(curr1!=null){
            if(curr1.val == key) return curr2.val;
            else{
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        ListNode curr1 = dummy1;
        ListNode curr2 = dummy2;
        while(curr1.next!=null){
        if(curr1.next.val == key){
            curr1.next = curr1.next.next;
            curr2.next = curr2.next.next;
        }
        else{
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        }
    }
}
