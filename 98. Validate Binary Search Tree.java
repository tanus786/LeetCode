class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean check(TreeNode node,long leftBound, long rightBound)
    {   
        if(node == null)
            return true;
        if (node.val <= leftBound || node.val >= rightBound)
            return false;
        return check(node.left, leftBound, node.val) && check(node.right, node.val, rightBound);
    }
}
