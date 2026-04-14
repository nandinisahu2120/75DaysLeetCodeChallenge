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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        int c=0,ans=-1;
        TreeNode curr=root;
        while( curr!=null && c!=k){
            if(curr.left==null){  //1). left side value 
                c++;
                if(c==k) return curr.val;
                // ans=curr.val;
                curr=curr.right;
            }
            else
            {
                TreeNode node=curr.left;
                while(node.right!=null && node.right!=curr){
                    node=node.right;
                }
                if(node.right==null){
                    node.right=curr;
                    curr=curr.left;
                }
                else if(node.right==curr){
                    node.right=null;
                    c++;
                    if(c==k) return curr.val;
                    // ans=curr.val;  //  2).  root value
                    curr=curr.right;
                }
            }


        }
        return -1;
    }
}