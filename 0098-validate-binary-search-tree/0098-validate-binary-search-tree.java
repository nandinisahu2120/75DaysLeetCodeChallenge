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
    boolean validate(TreeNode root, long leftval,long rightval){
        if(root==null) return true;
        boolean left,right;
        if(root.val>leftval && root.val<rightval){
            return validate(root.left,leftval,root.val) & validate(root.right,root.val,rightval);
        }
        else return false;
    }
    public boolean isValidBST(TreeNode root) {
        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}