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
    public int rob(TreeNode root) {
        HashMap<TreeNode,Integer>map=new HashMap<>();
        return solve(root,map);
    }
    public int solve(TreeNode root,HashMap<TreeNode,Integer>map){
        if(root==null){
            return 0;
        }
        if(map.containsKey(root)){
            return map.get(root);
        }
        //1st case chori krna h 
        int ans=root.val;
        if(root.left!=null){
            ans=ans+solve(root.left.left,map)+solve(root.left.right,map);
        }
         if(root.right!=null){
            ans=ans+solve(root.right.left,map)+solve(root.right.right,map);
        }
        //2nd case ab chori nhi krega 
        int ans2=solve(root.left,map)+solve(root.right,map);
        map.put(root,Math.max(ans,ans2));
        return Math.max(ans,ans2);
    }
}