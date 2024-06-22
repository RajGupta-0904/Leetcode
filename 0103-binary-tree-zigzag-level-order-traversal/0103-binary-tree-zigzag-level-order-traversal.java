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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        int level=0;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>ll=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode rv=q.poll();
                ll.add(rv.val);
                if(rv.left!=null){
                    q.add(rv.left);
                }
                if(rv.right!=null){
                    q.add(rv.right);
                }
            }
            // level++;
            if(level%2==1){
                // ans.add(Collections.reverse(ll));
                Collections.reverse(ll);
            }

            ans.add(ll);
            level++;
        }
        return ans;
    }
}