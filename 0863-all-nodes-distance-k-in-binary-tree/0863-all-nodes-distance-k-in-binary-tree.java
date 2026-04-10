/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    void parent(TreeNode root,Map<TreeNode,TreeNode> hp){
        if(root==null) return;
        if(root.left!=null) hp.put(root.left,root);
        if(root.right!=null) hp.put(root.right,root);
        parent(root.left,hp);
        parent(root.right,hp);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent_map=new HashMap<>();
        parent(root,parent_map);
        Set<TreeNode> visited=new HashSet<>();
        Queue<TreeNode> q=new LinkedList<>();
        int dis=0;
        q.offer(target);
        visited.add(target);
        while(!q.isEmpty() && dis!=k){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null && !visited.contains(node.left)){
                    q.offer(node.left);
                    visited.add(node.left);
                }
                if(node.right!=null && !visited.contains(node.right)){
                    q.offer(node.right);
                    visited.add(node.right);
                }
                if(parent_map.containsKey(node) && !visited.contains(parent_map.get(node))){
                    q.offer(parent_map.get(node));
                    visited.add(parent_map.get(node));
                }
            }
            if(!q.isEmpty()) dis++;
        }
        List<Integer> li=new ArrayList<>();
        for(TreeNode np:q){
            li.add(np.val);
        }
        return li;

    }
}