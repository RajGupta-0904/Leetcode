class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int a=solve(nums,goal);
        int b=solve(nums,goal-1);
        return Math.abs(b-a);
    }
    public static int solve(int []nums,int goal){
        if(goal<0) return 0;
         int si=0,ei=0,ans=0,sum=0;
        while(ei<nums.length){
            sum+=nums[ei];
            while(sum>goal && si<=ei){
                sum-=nums[si];
                si++;
            }
            ans+=ei-si+1;
            ei++;
        }
        return ans;
    }
}