class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int [cost.length];
        Arrays.fill(dp,-1);
        int zeroclimb=solve(cost,0,dp);
        int oneclimb=solve(cost,1,dp);
        return Math.min(zeroclimb,oneclimb);
        
    }
    public int solve(int []cost,int i,int []dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int one=solve(cost,i+1,dp);
        int two=solve(cost,i+2,dp);
        return dp[i]=Math.min(one,two)+cost[i];
    }
}