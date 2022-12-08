class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        postorderRecursive(root, list);
        return list;
    }
    public void postorderRecursive(TreeNode root, List list) {
        if (root == null) return;
    
        postorderRecursive(root.left, list);
        postorderRecursive(root.right, list);
        list.add(root.val);
        
    }
}
