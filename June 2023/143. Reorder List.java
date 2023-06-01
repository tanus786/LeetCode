class Solution {
    public ListNode reverse(ListNode h){
        ListNode curr=h;
        ListNode prev=null;
        while(curr!=null){
            ListNode forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        //finding middle node
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode rev=reverse(slow.next);
        slow.next=null;
        ListNode curr1=head;
        ListNode curr2=rev;
        //merging both lists
        while(curr1!=null&&curr2!=null){
            ListNode temp1=curr1.next;
            ListNode temp2=curr2.next;
            curr1.next=curr2;
            curr2.next=temp1;
            curr1=temp1;
            curr2=temp2;

        }
        
    }
}
