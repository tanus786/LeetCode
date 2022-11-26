class Solution {
    public int getDecimalValue(ListNode head) {
        String str = "0";
        while(head!=null){
            str += String.valueOf(head.val);
            head = head.next;
        }
        return Integer.parseInt(str,2);
    }
}


##solution 2
  
  class Solution {
    public int getDecimalValue(ListNode head) {
        int n=head.val;
        while(head.next!=null){
            n=n*2+head.next.val;
            head=head.next;
        }
        return n;
    }
}
