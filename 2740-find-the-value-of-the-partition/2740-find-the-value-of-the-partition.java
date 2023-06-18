class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int ans=solve(nums);
        return ans;
    }
    public static int solve(int []raj){
        int sol=Integer.MAX_VALUE;
        int ans=0;
        for(int i=1;i<raj.length;i++){
            ans=raj[i]-raj[i-1];
            sol=Math.min(ans,sol);
        }
        return sol;
    }
}