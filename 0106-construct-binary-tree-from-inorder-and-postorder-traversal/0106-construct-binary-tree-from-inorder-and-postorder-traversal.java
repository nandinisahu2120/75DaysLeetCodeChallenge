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
    public TreeNode treeBuilding(int[] inorder,int inStart,int inEnd,int[] postorder,int postStart,int postEnd,Map<Integer,Integer> inMap){
        if(inStart>inEnd || postStart>postEnd) return null;
        TreeNode root=new TreeNode(postorder[postEnd]);
        int inRoot=inMap.get(root.val);
        int numsLeft=inEnd-inRoot;
        root.left=treeBuilding(inorder,inStart,inRoot-1,postorder,postStart,postEnd-numsLeft-1,inMap);
        root.right=treeBuilding(inorder,inRoot+1,inEnd,postorder,postEnd-numsLeft,postEnd-1,inMap);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        TreeNode root=treeBuilding(inorder,0,inorder.length-1,postorder,0,postorder.length-1,inMap);
        return root;
    }
}