class Solution {
    public void leaf(TreeNode root , List<Integer> list){
        if(root == null){
            return ;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        if(root.left != null){
            leaf(root.left,list);
        }
        if(root.right != null){
            leaf(root.right,list);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        ArrayList<Integer> arr2= new ArrayList<Integer>();
        leaf(root1, arr1);
        leaf(root2, arr2);
        return arr1.equals(arr2);
    }
}
