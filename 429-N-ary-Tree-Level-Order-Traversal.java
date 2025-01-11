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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root==null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> arr=new ArrayList<>();
            int size=queue.size();
            while(size>0){
            Node node = queue.poll();
            arr.add(node.val);
                for(Node child : node.children){
                    queue.offer(child);
                }
                size--;
            }
            res.add(arr);
        }
        return res;
    }
}