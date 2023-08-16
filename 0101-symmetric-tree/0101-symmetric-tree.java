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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return false;
        return solve(root.left,root.right);
        
    }
    public static boolean solve(TreeNode a,TreeNode b){
        if(a==null || b==null){
            return a==b;
        }
        else if(a.val !=b.val ){
            return false;
        }
        return solve(a.right ,b.left)&& solve(a.left,b.right);
    }
}