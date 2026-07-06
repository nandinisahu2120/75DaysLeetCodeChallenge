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
    int height(TreeNode root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(!isBalanced(root.left) || !isBalanced(root.right)) return false;
        int lh = height(root.left);
        int rh = height(root.right);
        int diff = Math.abs(lh - rh);
        return (diff <= 1);
    }
}