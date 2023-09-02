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
    String str=null;
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        solve(root,sb);
        return str;
    }
    public void solve(TreeNode root , StringBuilder sb){
        if(root==null)
            return ;
        
        char ch=(char)(root.val+97);
        sb.append(ch);
        if(root.left==null && root.right==null){
            String a=sb.reverse().toString();
            if(str==null ||str.compareTo(a)  >0 ){
                str=a;
            }
            sb.reverse();
        }
        
        
        
        solve(root.left,sb);
        solve(root.right,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}