class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
       int dp[]=new int [arr.length];
        int sol=solve(0,arr,k,dp);
        return sol;
    }
    public static int solve(int idx,int arr[],int k,int []dp){
        int n=arr.length;
        if(idx==n){
            return 0;
        }
        if(dp[idx]!=0){
            return dp[idx];
        }
        int ans=Integer.MIN_VALUE;
        int len=0;
        int maxele=Integer.MIN_VALUE;
        for(int i=idx;i<Math.min(n,idx+k);i++){
            len++;
            maxele=Math.max(maxele,arr[i]);
            int sum=(len*maxele)+solve(i+1,arr,k,dp);
            ans=Math.max(ans,sum);
        }
        return dp[idx]=ans;
        
    }
    
}