class Solution {
    int m=0;
    public int maxAncestorDiff(TreeNode root) {
        
        if(root==null) return 0;
        dfs(root);
        return m;
    }
    
    int[] dfs(TreeNode root)
    {
        if(root==null) return null;
        int[] left=dfs(root.left);
        int[] right=dfs(root.right);
        if(left==null&&right==null) return new int[]{root.val,root.val};
        int min=root.val;
        int max=root.val;
        if(left!=null)
        {
            m=Math.max(m,Math.abs(left[0]-root.val));
            m=Math.max(m,Math.abs(left[1]-root.val));
            min=Math.min(min,left[0]);
            max=Math.max(max,left[1]);
        }
        if(right!=null)
        {
            m=Math.max(m,Math.abs(right[0]-root.val));
            m=Math.max(m,Math.abs(right[1]-root.val));
            min=Math.min(min,right[0]);
            max=Math.max(max,right[1]);
        }
        
        return new int[]{min,max};
    }
    
}
