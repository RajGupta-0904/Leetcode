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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        if(root==null) return  root;
        bstToGst(root.right);
        // int track=root.val;
        sum+=root.val;
        root.val=sum;
         bstToGst(root.left);
        return root;
//         in this we calaculate the sum of all the node whose  value is greater then that node the we replace it by that value 
    }
}