/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        int count=0;
        Queue<Node> queue=new LinkedList<>();
        if(root==null) return 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size>0){
                Node node = queue.poll();
                for(Node child : node.children){
                    queue.offer(child);
                }
                size--;
            }
            count++;
        }
        return count;
    }
}