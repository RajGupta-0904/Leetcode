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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        solve(root1,l1);
        solve(root2,l2);
        if(l1.equals(l2)){
            return true;
        }else{
            return false;
        }
    }
    public static void  solve(TreeNode node,ArrayList<Integer>ll){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            ll.add(node.val);
            return;
        }else{
            solve(node.left,ll);
            solve(node.right,ll);
        }
        
        
    }
}