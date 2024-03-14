class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return answer(nums,goal);
    }
        public static int answer (int []raj,int k){
        int count =0;
        for(int i=0;i<raj.length;i++){
            int sum=0;
            for(int j=i;j<raj.length;j++){
                sum=sum+raj[j];
                if(sum==k){
                count++;
            }
            }
            
        }
        return count;
    }
}