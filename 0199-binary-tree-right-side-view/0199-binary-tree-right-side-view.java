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
		int maxdepth=0;
	    public List<Integer> rightSideView(TreeNode root) {
	        List<Integer>ll =new ArrayList<>();

	        rightView(root,1,ll);
	        return ll;
	    }
	    public void rightView(TreeNode root,int cl,List<Integer>ll ) {
            if(root==null){
                return;
            }	       
            if(maxdepth<cl) {
	        	ll.add(root.val);
	        	maxdepth=cl;
	        }
	        rightView(root.right, cl+1, ll);
	        rightView(root.left, cl+1, ll);
	        
	    }
	}