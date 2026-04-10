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
        // TreeNode target;
    TreeNode parent(TreeNode root, int start,HashMap<TreeNode,TreeNode> hp ){
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode tar=null;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null) {hp.put(node.left,node);
                    q.offer(node.left);
                }
                if(node.right!=null){ hp.put(node.right,node);
                  q.offer(node.right);
                }
                if(node.val==start) tar=node;
            }
        }
        // if(root==null) return;
        // if(root.left!=null) hp.put(root.left,root);
        // if(root.right!=null) hp.put(root.right,root);
        // if(root.val==start) target[0]=root;
        // parent(root.left,target,start,hp);
        // parent(root.right,target,start,hp);
        return tar;
    }
    public int amountOfTime(TreeNode root, int start) {
        if(root==null) return 0;
        HashMap<TreeNode,TreeNode> parent_track=new HashMap<>();
        TreeNode target=parent(root,start,parent_track);
        Queue<TreeNode> q=new LinkedList<>();
        HashSet<TreeNode> visited=new HashSet<>();
        q.offer(target);
        // System.out.println(target.val);
        int time=0;

        visited.add(target);
        while(!q.isEmpty()){
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
                if(parent_track.containsKey(node) && !visited.contains(parent_track.get(node))){
                    q.offer(parent_track.get(node));
                    visited.add(parent_track.get(node));
                }
            }
            if(!q.isEmpty()) time++;
        }
        return time;
    }
}