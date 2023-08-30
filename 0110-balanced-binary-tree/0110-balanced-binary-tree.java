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
    public boolean isBalanced(TreeNode root) {
        Pair flag = Tree(root);
    return flag.isBBT; 
    }
    public Pair Tree(TreeNode root)
{
    if(root==null)
    {
       Pair bp = new Pair();
        bp.isBBT = true;
        bp.ht = 0;
        return bp;
    }
    
    Pair lp = Tree(root.left);         //left pair
    Pair rp = Tree(root.right);       // right pair
    
    Pair mp = new Pair();          //main pair
	mp.isBBT = (Math.abs(lp.ht - rp.ht)<=1) && lp.isBBT && rp.isBBT;    //condition to check balanced binary tree
	
    mp.ht = Math.max(lp.ht,rp.ht) + 1;
    
    return mp;
}

public class Pair                             //Pair class store height of tree and boolean is binary tree
{
    int ht;
    boolean isBBT;
}

}