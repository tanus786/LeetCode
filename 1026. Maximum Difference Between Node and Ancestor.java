class Solution {
    public void depth(TreeNode root , int n){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            return ;
        }
        if(root.left != null){
            n++;
           depth(root.left , n);

        }
        if(root.right != null){
            n++;
           depth(root.right , n);
            
        }
    }
    public int minDepth(TreeNode root) {
        int n=1, m=1 ;
        depth(root.left, n);
        depth(root.right, m);
        return Math.min(m,n);
    }
}
