class Solution {
    public int pairSum(ListNode head) {        
        int sum =0;
        ListNode node = head;
        int i =0;
        int size =0;
        int sum2=0;
        while(node!=null){
           size++;
           node = node.next;
        }
        node = head;
        while(node!= null){
            int pos = size -1 -i;
            i++;
            ListNode prev = head;
            for(int j= 0;j<pos;j++){
                prev = prev.next;
            }
            sum = node.val + prev.val;
            if(sum>sum2){
                sum2 = sum;
            }
            node = node.next;

        }
        return sum2;
    }
}
## Shows TLE🙂

ArrayList<Integer> list = new ArrayList<>();
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }
        int l = 0, r = list.size() - 1;
        int max = Integer.MIN_VALUE;
        while(l < r)
        {
            max = Math.max(max,list.get(l++)+list.get(r--));
        }
        return max;
