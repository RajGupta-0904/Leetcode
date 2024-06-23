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
    public TreeNode buildTree(int[] in, int[] post) {
         HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        int n=in.length;
        TreeNode ans=build(in,0,n-1,post,0,n-1,map);
        return ans;
    }
    public TreeNode build(int []in,int instart,int inend,int []post,int poststart,int postend,HashMap<Integer,Integer>map){
        if(poststart>postend || instart>inend){
            return null;
        }
        TreeNode root=new TreeNode(post[postend]);
        int inroot=map.get(root.val);
        int numsleft=inroot-instart;
        root.left=build(in,instart,inroot-1,post,poststart,poststart+numsleft-1,map);
        root.right=build(in,inroot+1,inend,post,poststart+numsleft,postend-1,map);
        return root;
    }
}