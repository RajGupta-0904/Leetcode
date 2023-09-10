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
    public int maxPathSum(TreeNode root) {
      max=Integer.MIN_VALUE;
        answer(root);
        return max;
    }
    int max;
    public int answer(TreeNode root){
        if(root==null ){
            return 0;
        }
        int left =answer(root.left);
        int right=answer(root.right);
        max=Math.max(max,root.val+left+right);
        return Math.max(0,Math.max(left,right)+root.val);
    } 
    
    
}