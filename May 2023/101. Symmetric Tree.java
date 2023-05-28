class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.right, root.left);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if(p==null && q!=null || q==null && p!=null)
            return false;
        if(p.val==q.val)
            return isSameTree(p.left,q.right) && isSameTree(p.right,q.left);
        return false;
    }
}
