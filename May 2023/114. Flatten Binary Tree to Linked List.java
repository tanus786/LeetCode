class Solution {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        preorderRecursive(root, list);
        for(int i = 1;i<list.size();i++){
           root.right=new TreeNode(list.get(i),null,null);
           root.left=null;
           root = root.right;
        }
    }
    public void preorderRecursive(TreeNode root, List list) {
        if (root == null) return;
    
        list.add(root.val);
        preorderRecursive(root.left, list);
        preorderRecursive(root.right, list);
    }
}
