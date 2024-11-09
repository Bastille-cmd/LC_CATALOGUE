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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int count1=1;
        int count2=1;
        TreeNode node1=root;
        TreeNode node2=root;
            while(node1.left!=null){
                count1++;
                node1=node1.left;
            }
            while(node2.right!=null){
                count2++;
                node2=node2.right;
            }
            if(count1==count2){
                return ((int)Math.pow(2,count1)-1);
            }
            return 1+countNodes(root.left) + countNodes(root.right);
    }
}