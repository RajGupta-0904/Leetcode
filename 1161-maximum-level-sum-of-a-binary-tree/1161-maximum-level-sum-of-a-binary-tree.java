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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int level=1;
        int sol=1;
        int ans=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode m = q.poll();
                sum+=m.val;
                if(m.left!=null)
                    q.add(m.left);
                if(m.right!=null)
                    q.add(m.right);
            }
                if(ans<sum){
                    ans=sum;
                    sol=level;
                }
                level++;
            }
        return sol;
        
    }
}