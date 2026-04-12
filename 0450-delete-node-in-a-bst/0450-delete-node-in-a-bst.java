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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val==key) return helper(root);
        TreeNode curr=root;
        while(curr!=null){
            if( curr.val>key){
                if(curr.left!=null ){
                    if(curr.left.val==key)
                    {curr.left=helper(curr.left);
                    break;
                    }
                    else curr=curr.left;
                }
                else break;
            }
            else{
                if(curr.right!=null ){
                    if(curr.right.val==key)
                    {curr.right=helper(curr.right);
                    break;
                    }
                    else curr=curr.right;
                }
                else break;

            }
        }
        return root;
    }
    TreeNode helper(TreeNode root){
        if(root.left==null) return root.right;
        else if(root.right==null) return root.left;
        else{
            TreeNode leftchild=root.left;
            TreeNode extremeLeftOfRightChild=extremeLeft(root.right);
            extremeLeftOfRightChild.left=leftchild;
            return root.right;
        }
    }
    TreeNode extremeLeft(TreeNode root){
        while(root.left!=null)
            root=root.left;
        return root;
    }
}