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
    public int findBottomLeftValue(TreeNode root) {
        a=0;
        ans=0;
        solve(root,1);
        return ans;
    }
    
    static int a=0;// a means level of tree we assume tree a
   // has a minimum one level 
    static int ans =0;
    public void solve(TreeNode root ,int level){
        if(root==null){
            return ;
        }
        if(a<level){
            a=level;
            ans=root.val;
        }
        solve(root.left,level+1);
        solve(root.right,level+1);
    }
}