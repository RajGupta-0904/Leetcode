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
    static Map<Integer,List<Integer>> map = new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
         constructMap(root,null);
        return calTime(start);
    }
    
    public static int calTime(int target){
        
        int time = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.add(target);
        visited.add(target);
        
        while(!queue.isEmpty()){
            int n = queue.size();
            
            for(int i=0;i<n;i++){
                int dequeued = queue.poll();
                
                for(int elems : map.get(dequeued)){
                    if(visited.contains(elems)){
                        continue;
                    }
                    queue.add(elems);
                    visited.add(elems);
                }
            }
            time++;
        }
        
        return time-1;
        
    }
     public static void constructMap(TreeNode root,TreeNode parent){
        if(root==null){
            return ;
        }
        else{
            map.put(root.val,new ArrayList<>());
            if(parent!=null){
                map.get(parent.val).add(root.val);
                map.get(root.val).add(parent.val);
            }
            constructMap(root.left,root);
            constructMap(root.right,root);
        }
    }
}