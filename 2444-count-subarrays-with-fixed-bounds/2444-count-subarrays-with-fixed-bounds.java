class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans=0;
        int minkidx=-1;
        int maxidx=-1;
        int culpritidx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==minK){
                minkidx=i;
            }
            if(nums[i]==maxK){
                maxidx=i;
            }
            if(nums[i]<minK || nums[i]>maxK){
                culpritidx=i;
            }
            long  smaller=Math.min(minkidx,maxidx);
            long temp=smaller-culpritidx;
            ans+=(temp<=0)?0:temp;
        }
        return ans;
    }
}