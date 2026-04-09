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
class Pair{
    int ind;
    TreeNode node;
    public Pair(TreeNode node,int ind){
        this.node=node;
        this.ind=ind;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
    Queue<Pair> q=new LinkedList<>();
    if(root==null ) return 0;
    int width=0;
    q.offer(new Pair(root,0));
    while(!q.isEmpty()){
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
        int size=q.size();
        int start=q.peek().ind;
        int last=0;
        for(int i=0;i<size;i++){
            Pair p=q.poll();
            TreeNode node=p.node;
            int ind=p.ind;
            last=ind;
            min=Math.min(min,ind);
            max=Math.max(max,ind);
            if(node.left!=null) q.offer(new Pair(node.left,2*(ind-min)+1));
            if(node.right!=null) q.offer(new Pair(node.right,2*(ind-min)+2));
        }
        width=Math.max(width,last-start+1);
    }       
    return width; 
    }
}