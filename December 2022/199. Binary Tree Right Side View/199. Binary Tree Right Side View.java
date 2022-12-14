class Solution {
    public void right(TreeNode root, List list,int depth){
        if(root == null){
            return;
        }
        if(depth == list.size()){
            list.add(root.val);
        }
        right(root.right, list, depth+1);
        right(root.left, list, depth+1);

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        right(root,list,0);
        return list;

    }
}
