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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer>ll=new ArrayList<>();
        inorder(root,ll);
        for(int i=0;i<ll.size();i++){
            for(int j=i+1;j<ll.size();j++){
                if(ll.get(i)+ll.get(j)==k){
                    return true;
                }
            }
        }
        return false;
    }
    public void inorder(TreeNode root ,List<Integer>ll){
        if(root==null) return ;
        inorder(root.left,ll);
        ll.add(root.val);
        inorder(root.right,ll);
    }
}