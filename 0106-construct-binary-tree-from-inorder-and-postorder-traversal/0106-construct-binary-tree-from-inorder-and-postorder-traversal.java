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
    TreeNode build(int posts, int poste, int ins, int ine , int[] postorder , HashMap<Integer, Integer> mp ){
        if(posts > poste || ins > ine) return null;
        TreeNode root = new TreeNode(postorder[poste]);
        int pos = mp.get(root.val);
        int noLeft = pos - ins;
        root.left = build(posts , posts + noLeft - 1 , ins , pos - 1,postorder , mp);
        root.right = build(posts + noLeft ,  poste - 1 , pos + 1 , ine,postorder, mp);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        HashMap<Integer , Integer > mp= new HashMap<>();
        for(int i = 0 ;i < n ; i ++){
            mp.put(inorder[i] , i);
        }
        return build(0 , n - 1 ,0 , n - 1, postorder, mp);
    }
}