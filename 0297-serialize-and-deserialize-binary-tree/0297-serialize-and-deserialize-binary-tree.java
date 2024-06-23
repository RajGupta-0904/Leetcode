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
        // Queue<TreeNode>q=new Linkedlist<>();
         Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null) sb.append("#,");
            else{
                sb.append(curr.val).append(",");
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="") return null;
        Queue<TreeNode>q=new LinkedList<>();
        String []value=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(value[0]));
        q.add(root);
        for(int i=1;i<value.length;i++){
            TreeNode parent=q.poll();
            if(!value[i].equals("#")){
                TreeNode left=new TreeNode(Integer.parseInt(value[i]));
                parent.left=left;
                q.add(left);
            }
            if(!value[++i].equals("#")){
                TreeNode right=new TreeNode(Integer.parseInt(value[i]));
                parent.right=right;
                q.add(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));