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
 class Triplets{
    int x , y;
    TreeNode node;
    Triplets(int x, int y , TreeNode node){
        this.x = x;
        this.y = y;
        this.node = node;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();
        if(root == null) return li;
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> mp = new TreeMap<>();
        Queue<Triplets> q = new LinkedList<>();
        q.offer(new Triplets(0, 0, root));
        while(!q.isEmpty()){
            Triplets t = q.poll();
            int x = t.x;
            int y = t.y;
            TreeNode node = t.node;
            int val =node.val;
            // if(node.left != null)
            // mp.put(x - 1, mp.getOrDefault())
            if(!mp.containsKey(x))
                mp.put(x,new TreeMap<>());
            if(!mp.get(x).containsKey(y))
                mp.get(x).put(y,new PriorityQueue<>());
            // TreeMap<Integer, PriorityQueue> tm = mp.get(x);
            mp.get(x).get(y).offer(val);
            if(node.left != null){
                q.offer(new Triplets(x - 1, y + 1, node.left));
            }
            if(node.right != null){
                q.offer(new Triplets(x + 1, y + 1, node.right));
            }
            
            
        }
        for(TreeMap<Integer, PriorityQueue<Integer>> tm : mp.values()){
            li.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq :tm.values()){
                while(!pq.isEmpty())
                    li.get(li.size() - 1).add(pq.poll());
            }
        }
        return li;
    }
}