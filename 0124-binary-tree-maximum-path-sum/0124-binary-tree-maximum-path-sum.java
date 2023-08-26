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
    int max;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        solve(root);
        return max;
    }
    public int solve(TreeNode root){
        if(root==null) return 0;
        int left=solve(root.left);
        int right=solve(root.right);
        max=Math.max(max,root.val+left+right);
        return Math.max(0,root.val+Math.max(left,right));
    }
}