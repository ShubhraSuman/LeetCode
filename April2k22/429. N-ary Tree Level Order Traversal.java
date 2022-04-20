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
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        if(root == null)
            return l1;
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            if(temp==null)
            {
                if(!q.isEmpty()) {                  
                    q.add(null);
                }
                l1.add(curr);
                curr = new ArrayList<>();
            }
            else
            {
                curr.add(temp.val);
                for(Node child: temp.children)
                {
                    if(child != null) {
                        q.add(child);
                    }
                }
            }
        }
        return l1;
    }
}
