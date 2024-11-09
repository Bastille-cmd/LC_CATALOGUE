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
    public boolean isBalanced(TreeNode root) {
        int height=Balanced(root);
        if(height==-1)
        return false;
        return true;
    }
    public int Balanced(TreeNode root){
        if(root==null) return 0;
        int leftSubtree=Balanced(root.left);
        int rightSubtree=Balanced(root.right);
        if(leftSubtree == -1 || rightSubtree == -1)
        return -1;
        if(Math.abs(leftSubtree-rightSubtree)>1)
        return -1;
        return 1+Math.max(leftSubtree,rightSubtree);
    }
}