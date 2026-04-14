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
    boolean haspath(TreeNode root, int target, int pathsum){
        if(root==null )return false;
        if(root.left==null && root.right==null){
            if(pathsum+root.val==target) return true;
            else return false;
        }
        return haspath(root.left,target,pathsum+root.val) | haspath(root.right,target,pathsum+root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return haspath(root,targetSum,0);
    }
}