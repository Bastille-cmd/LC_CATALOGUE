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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root.val==val) return root;
        TreeNode node=root;
        while(node!=null){
            if(val<node.val){
                if(node.left==null){
                    return null;
                }
                node=node.left;
                if(node.val==val){
                    return node;
                }
            }
            if(val>node.val){
                if(node.right==null){
                    return null;
                }
                node=node.right;
                if(node.val==val){
                    return node;
                }
            }
        }
        return null;
    }
}