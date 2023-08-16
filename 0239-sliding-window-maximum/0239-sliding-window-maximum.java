class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int [] max= new int[n-k+1];
//         n-l+1 is a number of window 
        Deque <Integer> dq=new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[dq.getLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.add(i);
        }
        
        max[0]=nums[dq.getFirst()];
        int j=1;
        for(int i=k;i<n;i++){
            while(!dq.isEmpty() && dq.getFirst()<=i-k){
                dq.remove();
            }
            while(!dq.isEmpty() && nums[dq.getLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.add(i);
            max[j++]=nums[dq.getFirst()];
            
        }
        return max;
    }
}