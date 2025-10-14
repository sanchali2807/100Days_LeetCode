
class Solution {
    public  boolean Sametree(TreeNode p , TreeNode q){
        if(p==null && q==null) return true;
        if(p==null) return false;
        if(q==null) return false;
        if(p.val != q.val) return false;
        return Sametree(p.left,q.left) && Sametree(p.right,q.right);
    }
    public TreeNode InvertTree(TreeNode root){
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        root.left = InvertTree(root.left);
        root.right = InvertTree(root.right);
        return root;
    }
    public boolean isSymmetric(TreeNode root) {
        root.left = InvertTree(root.left);
        return Sametree(root.left,root.right);
    }
}
