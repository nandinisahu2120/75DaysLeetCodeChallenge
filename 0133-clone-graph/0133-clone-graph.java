/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    void clone(Node copy, Node[] vis,Node nodee){
        vis[copy.val] = copy;
        // ArrayList<Node> temp = new ArrayList<>();
        
        for(Node it: nodee.neighbors){
            if(vis[it.val] == null){
                Node newnode = new Node(it.val);
                copy.neighbors.add(newnode);
                clone(newnode, vis, it);
            }
            else{
                copy.neighbors.add(vis[it.val]);
            }
        }
        // node.neighbors = (temp) ;

    }
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Node [] vis =new Node[100 + 1];
        for(int i = 0 ; i < 101 ; i++) vis[i] = null;
        // return clone(node);
        Node newNode = new Node(node.val);
        clone(newNode, vis, node);
        return newNode;


    }
}