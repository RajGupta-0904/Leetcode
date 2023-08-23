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
// agr normal array se bhi bst tree construct krna h to yhi logic rhega array ik sbhi element pr insert function call krenge loop m 
	class Solution {
		    public TreeNode insertIntoBST(TreeNode root, int val) {
		    	
		    	if(root==null) {
		    		return new TreeNode(val);
		    	}
		        if(root.val<val) {
		        	root.right=insertIntoBST(root.right, val);
		        }
		        else {
		        	root.left=insertIntoBST(root.left, val);
		        }
		        return root;
		    }
		}