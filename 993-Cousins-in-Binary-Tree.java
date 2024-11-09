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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        int childcount=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                int parentcount=0;
                if(node.left!=null){ 
                    if(node.left.val == x || node.left.val == y){ 
                    parentcount++;
                    childcount++;
                    }
                    queue.offer(node.left);
                }
                if(node.right!=null){ 
                    if(node.right.val == x || node.right.val == y){ 
                    parentcount++;
                    childcount++;
                    }
                    queue.offer(node.right);
                }
                if(parentcount==2) return false;
            }
            if(childcount==2) return true;
            if(childcount==1) return false;
        }
        return false;
    }
}