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
    // void inorder(TreeNode node,List<Integer> li){
        // if(node==null) return;
        // inorder(node.left,li);
        // li.add(node.val);
        // inorder(node.right,li);
    //     if(root== null) return;
    //     if(root.left==null){
    //         li.add(root.val);
    //         r
    //     }
    // }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left==null){
                li.add(curr.val);
                curr=curr.right;
                continue;
            }
            TreeNode prev=curr.left;
            while(prev.right!=null && prev.right!=curr)
            prev=prev.right;
            if(prev.right==null){
                prev.right=curr;
                curr=curr.left;

            }
            else if(prev.right==curr){
                prev.right=null;
                li.add(curr.val);
                curr=curr.right;
            }

        }
        return li;
    }
}