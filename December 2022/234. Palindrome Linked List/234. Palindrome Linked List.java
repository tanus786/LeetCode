class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }
        int l = 0, r = list.size() - 1;
        while(l < r)
        {
            if(list.get(l++)!= list.get(r--)){
                return false;
            }
        }
        return true;
    }
}
