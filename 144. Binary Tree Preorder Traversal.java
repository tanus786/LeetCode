public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        preorderRecursive(root, list);
        return list;
    }
    public void preorderRecursive(TreeNode root, List list) {
        if (root == null) return;
    
        list.add(root.val);
        preorderRecursive(root.left, list);
        preorderRecursive(root.right, list);
    }
}
