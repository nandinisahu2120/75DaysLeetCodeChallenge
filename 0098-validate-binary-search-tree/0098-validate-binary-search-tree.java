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
    public boolean isValidBST(TreeNode root) {
        if(root==null) return false;
        TreeNode curr=root;
        int i=0;
        int prev=Integer.MIN_VALUE;
        while(curr!=null){
            if(curr.left==null){
                if(curr.val<=prev && i!=0) return false;
                i++;
                prev=curr.val;
                curr=curr.right;
            }
            else{
                TreeNode node=curr.left;
                while(node.right!=null && node.right!=curr)
                    node=node.right;
                if(node.right==null){
                    node.right=curr;
                    curr=curr.left;

                }
                else{
                    node.right=null;
                    if(curr.val<=prev && i!=0) return false;
                    i++;
                    prev=curr.val;
                    curr=curr.right;
                }
            }
        }
        return true;
    }
}