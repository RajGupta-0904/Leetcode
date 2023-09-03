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
class BSTIterator {
    List<Integer> ll =new ArrayList<>();
    int idx=0;
    public BSTIterator(TreeNode root) {
       inorder(root); 
    }
    public void inorder(TreeNode root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        ll.add(root.val);
        inorder(root.right);
    }
    
    public int next() {
        return ll.get(idx++);
    }
    
    public boolean hasNext() {
        if(idx<ll.size())
            return true;
        else
            return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */