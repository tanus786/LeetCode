public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodeseen = new HashSet<>();
        while(headA!=null)
        {
            nodeseen.add(headA);
            headA= headA.next;
        }
        while(headB!=null){
            if(nodeseen.contains(headB))
                return headB;
            else
                headB = headB.next;
        }
        return null;
    }
}
