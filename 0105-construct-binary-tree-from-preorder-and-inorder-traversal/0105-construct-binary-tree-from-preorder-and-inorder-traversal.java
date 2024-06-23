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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      Map<Integer, Integer> inMap = new HashMap<>();

        // Populate the map with indices
        // of elements in the inorder traversal
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        // Call the private helper function
        // to recursively build the tree
        TreeNode root = build(preorder, 0, preorder.length- 1, inorder, 0, inorder.length- 1, inMap);

        return root;

    }
    public TreeNode build(int []preorder,int preStart,int preEnd,int []inorder,int inStart,int inEnd,Map<Integer,Integer>inMap){
                if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        // Create a new TreeNode with value
        // at the current preorder index
        TreeNode root = new TreeNode(preorder[preStart]);

        // Find the index of the current root
        // value in the inorder traversal
        int inRoot = inMap.get(root.val);

        // Calculate the number of
        // elements in the left subtree
        int numsLeft = inRoot - inStart;

        // Recursively build the left subtree
        root.left = build(preorder, preStart + 1, preStart + numsLeft,
                inorder, inStart, inRoot - 1, inMap);

        // Recursively build the right subtree
        root.right = build(preorder, preStart + numsLeft + 1, preEnd,
                inorder, inRoot + 1, inEnd, inMap);

        // Return the current root node
        return root;
   
    }
}