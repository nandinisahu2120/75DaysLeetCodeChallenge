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
        TreeNode prev;
    void flattenx(TreeNode root){
        if(root==null) return ;
        flattenx(root.right);
        flattenx(root.left);
        root.right=prev;
        root.left=null;
        prev=root;
    }
    public void flatten(TreeNode root) {
        if(root==null ) return ;
         prev=null;
        flattenx(root);
        

    }
}