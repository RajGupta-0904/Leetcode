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
    int idx=0;
    public void recoverTree(TreeNode root) {
        List<Integer> ll =new ArrayList<>();
        inorder(ll,root);
        Collections.sort(ll);
        inorder1(ll,root);
    }
//     first we traverse a tree in inorder meth0d and value in the form of list then we sort bebeacuse bst is formed only when inorder list are sorted 
    public void inorder(List<Integer> ll , TreeNode root){
        if(root==null){
            return;
        }
        inorder(ll,root.left);
        ll.add(root.val);
        inorder(ll,root.right);
    }
      public void inorder1(List<Integer> ll , TreeNode root){
        if(root==null){
            return;
        }
        inorder1(ll,root.left);
        root.val=ll.get(idx);
          idx++;
        inorder1(ll,root.right);
    }
}