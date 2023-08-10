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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh= diameterOfBinaryTree(root.left);
        int rh= diameterOfBinaryTree(root.right);
        int sd=height(root.left)+height(root.right)+2;
        return Math.max(lh,Math.max(rh,sd));
    }
    
    public static int height(TreeNode m) {
		if(m==null) {
			return -1;
			//single node ki height 0 aayega
//			single node ki height 1 hoga if we return 0
		}
		
		int lh=height(m.left);
		int rh=height(m.right);
		return Math.max(lh, rh)+1;
	}
    
}