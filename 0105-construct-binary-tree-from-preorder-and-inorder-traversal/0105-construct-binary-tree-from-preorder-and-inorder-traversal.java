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
    public TreeNode treeBuilding(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd,Map<Integer,Integer> inMap){
    if(preStart>preEnd || inStart>inEnd) return null;
    TreeNode root=new TreeNode(preorder[preStart]);
    int rootInd=inMap.get(preorder[preStart]);
    int numLen=rootInd-inStart;
    root.left=treeBuilding(preorder,preStart+1,preStart+numLen,inorder,inStart,rootInd-1,inMap);
    root.right=treeBuilding(preorder,preStart+numLen+1,preEnd,inorder,rootInd+1,inEnd,inMap);
    return root;
    
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inMap=new HashMap<>();
        for(int i=0;i<preorder.length;i++){
            inMap.put(inorder[i],i);
        }
        TreeNode root=treeBuilding(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inMap);
        return root;
    }
}