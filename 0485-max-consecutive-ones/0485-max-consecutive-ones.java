class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int ans=Integer.MIN_VALUE;
        for(int a:nums){
            if(a==1){
                count++;
            }else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}