class Solution {
    public int numberOfWays(int n, int x) {
        int dp[][]=new int [301][301];
        for(int a []:dp){
        Arrays.fill(a,-1);
        }
        return solve(n,x,1,dp);
    }
    static int M =1000000007;
    public int solve (int n ,int x, int num,int dp[][]){
        if(n==0) return 1;
        if(n<0) return 0;
        int curr=(int)Math.pow(num,x);
        // if(dp[n][num]!=-1) return dp[n][num];
        if(curr>n) return 0;
        if(dp[n][num]!=-1) return dp[n][num];
        int take=solve(n-curr,x,num+1,dp);
        int nontake=solve(n,x,num+1,dp);
        return dp[n][num]=(take+nontake)%M;
    }
}