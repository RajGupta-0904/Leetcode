class Solution {
    public int maxProfit(int[] a) {
       int dp[][]=new int [a.length][2];
       for(int []i:dp){
        Arrays.fill(i,-1);
       } 
       return solve(a,0,0,dp);
    }
    static int solve(int []arr,int idx,int buy,int [][]dp){
        if(idx>=arr.length) return 0;
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        int profit =0;
        if(buy==0){
            profit=Math.max(0+solve(arr,idx+1,0,dp),-arr[idx]+solve(arr,idx+1,1,dp));
        }
        if(buy==1){
            profit=Math.max(0+solve(arr,idx+1,1,dp),arr[idx]+solve(arr,idx+2,0,dp));
        }
        dp[idx][buy]=profit;
        return profit;
    }
}