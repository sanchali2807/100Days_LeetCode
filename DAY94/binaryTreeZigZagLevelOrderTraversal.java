/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int height(TreeNode root){
        if(root == null)return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public void levelTraversalFromleft(TreeNode root , int level , List<Integer> list){
        if(root == null)return;
        if(level == 1){
            list.add(root.val);
            return;
        }
        levelTraversalFromleft(root.left , level - 1 , list);
        levelTraversalFromleft(root.right , level - 1 , list);
    }
    public void levelTraversalFromRight(TreeNode root , int level , List<Integer> list){
        if(root == null)return;
        if(level == 1){
            list.add(root.val);
            return;
        }
        levelTraversalFromRight(root.right , level - 1 , list);
        levelTraversalFromRight(root.left , level - 1 , list);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = height(root);
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)return result;
        for(int i=1;i<=level;i++){
            List<Integer> list = new ArrayList<>();
            if(i%2!=0){
            levelTraversalFromleft(root,i,list);
            result.add(list);
            }else{
                levelTraversalFromRight(root,i,list);
                result.add(list);
            }
        }
        return result;
    }
}
