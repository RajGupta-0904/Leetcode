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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>>ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
		Queue<TreeNode> hlp=new LinkedList<>();
		// List<List<Integer>>ans = new ArrayList<>();
		List<Integer>ll = new ArrayList<>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode rv=q.remove();//remove first q.poll();
//			System.out.print(rv.data+" ");
			ll.add(rv.val);
			if(rv.left!=null) {
				hlp.add(rv.left);
			}
			if(rv.right!=null) {
				hlp.add(rv.right);
			}
			if(q.isEmpty()) {
				q=hlp;
				hlp=new LinkedList<>();
				ans.add(ll);
				ll=new ArrayList<>();
//				System.out.println();
			}

		}
		return ans;

    }
}