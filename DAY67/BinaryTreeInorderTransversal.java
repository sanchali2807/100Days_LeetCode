class Solution {
    List<Integer> ans = new ArrayList<>();
    public void function(TreeNode root){
        if(root==null)return;
        function(root.left);
        ans.add(root.val);
        function(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        function(root);
        return ans;
    }
}
