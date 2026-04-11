/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder sb=new StringBuilder();
        sb.append(root.val).append(" ");
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++)
           { 
            TreeNode node=q.poll();
                if(node.left!=null)
                {
                    q.offer(node.left);
                    sb.append(node.left.val).append(" ");

                }
                else 
                    sb.append("# ");
                
                if(node.right!=null)
                {
                    q.offer(node.right);
                    sb.append(node.right.val).append(" ");

                }
                else 
                    sb.append("# ");
                

            }
        }
        return sb.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")) return null;
        String[] sb=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(sb[0]));
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        for(int i=1;i<sb.length;i++){
            TreeNode node=q.poll();
            if( !sb[i].equals("#")){
                TreeNode left=new TreeNode(Integer.parseInt(sb[i]));
                node.left=left;
                q.offer(node.left);
            }
            
            if(!sb[++i].equals("#")){
                TreeNode right=new TreeNode(Integer.parseInt(sb[i]));
                node.right=right;
                q.offer(node.right);
            }

        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));