class Solution {
    public int longestSubarray(int[] nums) {
       int  si=0,ei=0,z=0;
        int ans=0;
        while(ei<nums.length){
            if(nums[ei]==0)
                z++;
            // /z=no.of zeros
            while(z==2){
                if(nums[si]==0)
                    z--;
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return --ans;
 
    }
}