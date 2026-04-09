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
    void path(TreeNode node,List<Integer> li,List<String> ans){
        if(node==null) return;
        li.add(node.val);
        System.out.print(" "+li);
        if(node.left==null && node.right==null){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<li.size()-1;i++){
                sb.append(li.get(i)).append("-").append(">");
            }
            sb.append(li.get(li.size()-1));
            ans.add(sb.toString());
            li.remove(li.size()-1);
            return;
        }
        path(node.left,li,ans);
        path(node.right,li,ans);
        System.out.print(" "+li.get(li.size()-1));
        li.remove(li.size()-1);
        System.out.println();
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> li=new ArrayList<>();
        path(root,new ArrayList<>(),li);
        return li;
    }
}